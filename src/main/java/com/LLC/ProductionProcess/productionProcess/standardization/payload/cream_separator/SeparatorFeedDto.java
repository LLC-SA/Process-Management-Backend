package com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeparatorFeedDto {
    private String feedType;
    private Integer feedConcentration;
    private Integer feedTemperature;
    private Double feedPh;
}
