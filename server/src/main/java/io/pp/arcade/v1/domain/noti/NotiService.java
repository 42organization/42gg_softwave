package io.pp.arcade.v1.domain.noti;

import io.pp.arcade.v1.domain.admin.dto.create.NotiCreateRequestDto;
import io.pp.arcade.v1.domain.admin.dto.update.NotiUpdateRequestDto;
import io.pp.arcade.v1.domain.noti.dto.*;
import io.pp.arcade.v1.domain.slot.Slot;
import io.pp.arcade.v1.domain.slot.SlotRepository;
import io.pp.arcade.v1.domain.slotteamuser.SlotTeamUser;
import io.pp.arcade.v1.domain.slotteamuser.SlotTeamUserRepository;
import io.pp.arcade.v1.domain.user.User;
import io.pp.arcade.v1.domain.user.UserRepository;
import io.pp.arcade.v1.global.exception.BusinessException;
import io.pp.arcade.v1.global.type.NotiType;
import io.pp.arcade.v1.global.util.AsyncMailSender;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NotiService {
    private final NotiRepository notiRepository;
    private final UserRepository userRepository;
    private final SlotRepository slotRepository;
    private final JavaMailSender javaMailSender;
    private final AsyncMailSender asyncMailSender;
    private final SlotTeamUserRepository slotTeamUserRepository;

    @Transactional
    public void addNoti(NotiAddDto notiAddDto) {
        Slot slot = null;
        if (notiAddDto.getSlot() != null) {
            slot = slotRepository.findById(notiAddDto.getSlot().getId()).orElseThrow(() -> new BusinessException("E0001"));
            List<SlotTeamUser> slotTeamUser = slotTeamUserRepository.findAllBySlotId(notiAddDto.getSlot().getId());
            for (SlotTeamUser users : slotTeamUser) {
                Noti noti = notiRepository.save(Noti.builder()
                        .slot(slot)
                        .user(users.getUser())
                        .type(notiAddDto.getType())
                        .message(notiAddDto.getMessage())
                        .isChecked(false)
                        .build());
                sendMail(noti, users.getUser());
            }
        } else {
            User user = userRepository.findById(notiAddDto.getUser().getId()).orElseThrow(() -> new BusinessException("E0001"));
            Noti noti = notiRepository.save(Noti.builder()
                    .slot(slot)
                    .user(user)
                    .type(notiAddDto.getType())
                    .message(notiAddDto.getMessage())
                    .isChecked(false)
                    .build());
            sendMail(noti, user);
            notiRepository.save(noti);
        }
    }

    private void sendMail(Noti noti, User user) {
//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message);
//        helper.setSubject("핑퐁요정🧚으로부터 도착한 편지");
//        helper.setTo(user.getEMail());
//        if (noti.getType() != NotiType.ANNOUNCE) {
//            helper.setText("🧚: \"새로운 알림이 도착했핑.\"\n" + "🧚: \"" + noti.getType().getMessage() + "\"\n\n 🏓42GG와 함께하는 행복한 탁구생활🏓" +
//                    "\n$$지금 즉시 접속$$ ----> https://42gg.kr");
//        } else {
//            helper.setText("🧚: \"새로운 알림이 도착했핑.\"\n" + "🧚: \"" + noti.getType().getMessage() + "\"\n\n공지사항: " + noti.getMessage() + "\n\n 🏓42GG와 함께하는 행복한 탁구생활🏓" +
//                    "\n$$지금 즉시 접속$$ ----> https://42gg.kr");
//        }
//        asyncMailSender.send(message);
    }

    @Transactional
    public List<NotiDto> findNotiByUser(NotiFindDto findDto) {
        User user = userRepository.findById(findDto.getUser().getId()).orElseThrow(() -> new BusinessException("E0001"));
        List<Noti> notis = notiRepository.findAllByUserOrderByIdDesc(user);
        List<NotiDto> notiDtoList = notis.stream().map(NotiDto::from).collect(Collectors.toList());
        return notiDtoList;
    }

    @Transactional
    public NotiDto findNotiByIdAndUser(NotiFindDto findDto) {
        Noti noti = notiRepository.findByIdAndUserId(findDto.getNotiId(), findDto.getUser().getId()).orElseThrow(() -> new BusinessException("E0001"));
        return NotiDto.from(noti);
    }

    public List<NotiDto> findNotisBySlotId(Integer slotId) {
        return notiRepository.findAllBySlotId(slotId).stream().map(NotiDto::from).collect(Collectors.toList());
    }

    @Transactional
    public void deleteNotiById(Integer slotId) {
        Noti noti = notiRepository.findById(slotId).orElse(null);
        if (noti == null) {
            return;
        }
        notiRepository.delete(noti);
    }
    @Transactional
    public NotiCountDto countAllNByUser(NotiFindDto findDto) {
        User user = userRepository.findById(findDto.getUser().getId()).orElseThrow(() -> new BusinessException("E0001"));
        Integer count = notiRepository.countAllNByUserAndIsChecked(user, false);
        NotiCountDto countDto = NotiCountDto.builder().notiCount(count).build();
        return countDto;
    }

    @Transactional
    public void modifyNotiChecked(NotiModifyDto modifyDto) {
        User user = userRepository.findById(modifyDto.getUser().getId()).orElseThrow(() -> new BusinessException("E0001"));
        List<Noti> notis = notiRepository.findAllByUser(user);
        notis.forEach(noti -> {noti.setIsChecked(true);});
    }

    @Transactional
    public void removeAllNotisByUser(NotiDeleteDto deleteDto) {
        User user = userRepository.findById(deleteDto.getUser().getId()).orElseThrow(() -> new BusinessException("E0001"));
        notiRepository.deleteAllByUser(user);
    }

    @Transactional
    public void removeNotiById(NotiDeleteDto deleteDto) {
        notiRepository.deleteById(deleteDto.getNotiId());
    }

    @Transactional
    public void createNotiByAdmin(NotiCreateRequestDto createRequestDto) throws MessagingException {
        Slot slot = createRequestDto.getSlotId() == null ? null : slotRepository.findById(createRequestDto.getSlotId()).orElse(null);
        User user = userRepository.findByIntraId(createRequestDto.getUserId()).orElseThrow();
        Noti noti = Noti.builder()
                .slot(slot)
                .user(user)
                .type(createRequestDto.getNotiType())
                .message(createRequestDto.getMessage())
                .isChecked(createRequestDto.getIsChecked())
                .build();
        notiRepository.save(noti);
        if (createRequestDto.getSendMail()) {
            sendMail(noti, user);
        }
    }

    @Transactional
    public void updateNotiByAdmin(NotiUpdateRequestDto updateRequestDto) {
        Noti noti = notiRepository.findById(updateRequestDto.getNotiId()).orElseThrow();

        User user = userRepository.findById(updateRequestDto.getUserId()).orElse(null);
        Slot slot = slotRepository.findById(updateRequestDto.getSlotId()).orElse(null);
        noti.update(user, slot, updateRequestDto.getNotiType(), updateRequestDto.getMessage(), updateRequestDto.getIsChecked()); // 더 고칠게 있을까요
    }

    @Transactional
    public void deleteNotibyAdmin(NotiDeleteDto deleteDto) {
        Noti noti = notiRepository.findById(deleteDto.getNotiId()).orElseThrow();
        notiRepository.delete(noti);
    }

    @Transactional
    public List<NotiDto> findNotiByAdmin(Pageable pageable) {
        Page<Noti> notis = notiRepository.findAllByOrderByIdDesc(pageable);
        List<NotiDto> notiDtos = notis.stream().map(NotiDto::from).collect(Collectors.toList());
        return notiDtos;
    }

    @Transactional
    public void createNotiForAll(NotiCreateRequestDto createRequestDto) {
        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            Noti noti = Noti.builder()
                    .user(user)
                    .type(NotiType.ANNOUNCE)
                    .message(createRequestDto.getMessage())
                    .isChecked(false)
                    .build();
            notiRepository.save(noti);
        });
    }

    @Transactional
    public void createEventNotiForAll(NotiAddDto addDto) {
        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            Noti noti = Noti.builder()
                    .user(user)
                    .type(NotiType.ANNOUNCE)
                    .message(addDto.getMessage())
                    .isChecked(false)
                    .build();
            notiRepository.save(noti);
        });
    }

    @Transactional
    public void sendEventMail(NotiAddDto addDto) throws MessagingException {
        User user = userRepository.findById(addDto.getUser().getId()).orElse(null);
        Noti noti = Noti.builder()
                .user(user)
                .type(NotiType.ANNOUNCE)
                .message("축하합니다!! 이벤트에 당첨되었습니다🎉")
                .isChecked(false)
                .build();
        sendMail(noti, user);
    }
}
