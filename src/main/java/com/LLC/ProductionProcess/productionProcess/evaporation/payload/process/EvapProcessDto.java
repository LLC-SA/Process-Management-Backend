package com.LLC.ProductionProcess.productionProcess.evaporation.payload.process;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvapProcessDto {
    private Integer effectOneTemp;
    private Integer effectTwoTemp;
    private Integer effectThreeTemp;
    private Double boilerSteamPressure;
    private Double evaporatorSteamPressure;
    private Integer coolingTowerIn;
    private Integer coolingTowerOut;
    private Integer flashTemp;
    private Integer vacuumPressure;
    private String productOutput;
    private Double productSolids;
}
