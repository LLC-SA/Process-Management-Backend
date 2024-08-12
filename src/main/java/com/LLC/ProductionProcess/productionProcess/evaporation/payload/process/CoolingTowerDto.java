package com.LLC.ProductionProcess.productionProcess.evaporation.payload.process;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoolingTowerDto {
    private Integer saltConcentration;
    private Boolean isWaterChanged;
}
