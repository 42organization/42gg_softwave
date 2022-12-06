package io.pp.arcade.v1.domain.admin;

import io.pp.arcade.v1.domain.admin.dto.AdminCheckerDto;
import io.pp.arcade.v1.domain.security.jwt.TokenService;
import io.pp.arcade.v1.global.type.RoleType;
import io.pp.arcade.v1.global.util.ApplicationYmlRead;
import lombok.AllArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

@Aspect
@AllArgsConstructor
@Component
public class AdminManagementAspect {
    private final TokenService tokenService;
    private final ApplicationYmlRead applicationYmlRead;

    @Pointcut("execution(* io.pp.arcade.v1.domain.admin.controller..*(..))")
    public void managedAdminController() {
    }

    @Pointcut("execution(* io.pp.arcade.v1.domain.admin.management..*(..))")
    public void adminManagementController() {
    }

    @Around("managedAdminController() && adminManagementController()")
    public Object checkAdmin(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        Object target = joinPoint.getTarget();
        Method method = signature.getMethod();
        Object[] args = joinPoint.getArgs();
        /* Request 정보 가져오기 */
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getResponse();

        HttpSession session = request.getSession();
        AdminCheckerDto sessionUser = (AdminCheckerDto) session.getAttribute("user");
        if (sessionUser == null || sessionUser.getRoleType() != RoleType.ADMIN)
            return redirect(response);
        // 실제 실행할 메서드
        return method.invoke(target, args);
    }

    private Object redirect(HttpServletResponse response) throws Throwable {
        /* response 클라이언트 대기 모드로 바꾸기 */
        String frontUrl = applicationYmlRead.getFrontUrl();
        response.sendRedirect(frontUrl);
        return frontUrl;
    }
}
