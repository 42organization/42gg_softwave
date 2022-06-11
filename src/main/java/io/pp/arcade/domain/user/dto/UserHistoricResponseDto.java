package io.pp.arcade.domain.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserHistoricResponseDto {
    private Integer gameId;
    private Integer userId;
    private Integer pppChange;
    private Integer pppResult;
}
