package io.pp.arcade.v1.domain.admin.controller;

import io.pp.arcade.v1.domain.admin.service.AdminRankService;
import io.pp.arcade.v1.domain.rank.dto.RankDto;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/admin")
public class RankAdminControllerImpl implements RankAdminController {
    private final AdminRankService rankRedisService;

    /* 봉인
    @Override
    @PostMapping(value = "/rank")
    public void rankCreate(RankCreateRequestDto createRequestDto, HttpServletRequest request) {
        rankRedisService.createRankByAdmin(createRequestDto);
    }

    @Override
    @PutMapping(value = "/rank")
    public void rankUpdate(RankUpdateRequestDto updateRequestDto, HttpServletRequest request) {
        rankRedisService.updateRankByAdmin(updateRequestDto);
    }

    @Override
    @DeleteMapping(value = "/rank/{rankId}")
    public void rankDelete(Integer rankId, HttpServletRequest request) {
        RankDeleteDto deleteDto = RankDeleteDto.builder().rankId(rankId).build();
        rankRedisService.deleteRankByAdmin(deleteDto);
    }
    */

    @Override
    @GetMapping(value = "/rank/all")
    public List<RankDto> rankAll(Pageable pageable, HttpServletRequest request) {
        List<RankDto> ranks = rankRedisService.findRankByAdmin(pageable);
        return ranks;
    }
}
