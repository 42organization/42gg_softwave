package io.pp.arcade.v1.domain.admin.controller;

import io.pp.arcade.v1.domain.admin.dto.create.SeasonCreateRequestDto;
import io.pp.arcade.v1.domain.admin.dto.update.SeasonUpdateDto;
import io.pp.arcade.v1.domain.admin.service.AdminRankService;
import io.pp.arcade.v1.domain.rank.service.RankService;
import io.pp.arcade.v1.domain.season.SeasonService;
import io.pp.arcade.v1.domain.season.dto.SeasonCreateDto;
import io.pp.arcade.v1.domain.season.dto.SeasonDeleteDto;
import io.pp.arcade.v1.domain.season.dto.SeasonDto;
import io.pp.arcade.v1.global.type.Mode;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/admin")
public class SeasonAdminControllerImpl implements SeasonAdminController {
    private final SeasonService seasonService;
    private final AdminRankService rankService;
    @Override
    @PostMapping(value = "/season")
    public void seasonCreate(SeasonCreateRequestDto createRequestDto, HttpServletRequest request) {
        SeasonCreateDto createDto = SeasonCreateDto.builder()
                .seasonName(createRequestDto.getSeasonName())
                .seasonMode(createRequestDto.getSeasonMode())
                .pppGap(createRequestDto.getPppGap())
                .startPpp(createRequestDto.getStartPpp()).build();
        seasonService.createSeasonByAdmin(createDto);
        if (createRequestDto.getSeasonMode() != Mode.NORMAL) {
            SeasonDto seasonDto = seasonService.findLatestRankSeason();
            rankService.addAllUserRankByNewSeason(seasonDto, createRequestDto.getStartPpp());
        }
    }

    @Override
    @DeleteMapping(value = "/season/{seasonId}")
    public void seasonDelete(Integer seasonId, HttpServletRequest request) {
        SeasonDeleteDto deleteDto = SeasonDeleteDto.builder()
                .seasonId(seasonId).build();
        seasonService.deleteSeasonByAdmin(deleteDto);
    }

    @Override
    @PutMapping(value = "/season")
    public void seasonUpdate(SeasonUpdateDto seasonUpdateDto, HttpServletRequest request) {
        seasonService.updateSeasonByAdmin(seasonUpdateDto);
    }

    @Override
    @GetMapping(value = "/season/all")
    public List<SeasonDto> seasonAll(Pageable pageable, HttpServletRequest request) {
        List<SeasonDto> seasons = seasonService.findSeasonsByAdmin(pageable);
        return seasons;
    }
}
