package com.LLC.ProductionProcess.productionProcess.spray_one.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SprayProcessDto {
    private Integer productionHours;
    private Integer currentContainerLevel;
    private Boolean isFilterCleaned;
    private Integer heaterTemperature;
    private Integer dryerTemperature;
    private Integer feedPumpPressure;
    private Integer highPumpPressure;
    private Integer highPumpRPM;
    private Integer vibroOneTempOne;
    private Integer vibroOneTempTwo;
    private Integer vibroTwoTempOne;
    private Integer vibroTwoTempTwo;
    private Integer vibroTwoTempThree;
    private Integer nozzleQuantity;
}
