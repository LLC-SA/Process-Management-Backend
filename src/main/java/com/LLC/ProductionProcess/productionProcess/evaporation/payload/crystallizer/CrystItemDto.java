package com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrystItemDto {
    private Long id;
    private Double pasteurizationTemperature;
    private Double productConcentration;
    private Integer coolingTemperature;
}

