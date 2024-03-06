package com.LLC.ProductionProcess.productionProcess.evaporation.payload.process;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasteurizerDto {
    private String feedOrigin;
    private Double feedPh;
    private Double feedTemp;
    private Integer feedContainerLevel;
    private Double feedSolids;
    private Integer hotWaterTemp;
    private Integer pasteurizationTemp;
    private Integer flowRate;
}
