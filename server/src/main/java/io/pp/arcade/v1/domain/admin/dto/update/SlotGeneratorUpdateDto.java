package io.pp.arcade.v1.domain.admin.dto.update;

import lombok.Getter;

@Getter
public class SlotGeneratorUpdateDto {
    private Integer startTime;
    private Integer interval;
    private Integer slotNum;
}
