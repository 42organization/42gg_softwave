package io.pp.arcade.v1.domain.admin.dto.create;

import lombok.Getter;

@Getter
public class PChangeCreateRequestDto {
    private Integer gameId;
    private Integer userId;
    private Integer pppChange;
    private Integer pppResult;
}
