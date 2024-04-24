package com.LLC.ProductionProcess.productionProcess.standardization.payload.nanofiltration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NanoFeedDto {
    private String feedType;
    private Integer feedConcentration;
    private Integer feedTemperature;
    private Double feedPh;
    private Integer feedTurbidity;
}
