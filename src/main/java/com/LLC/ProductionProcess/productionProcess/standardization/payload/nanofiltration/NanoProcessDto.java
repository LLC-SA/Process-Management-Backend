package com.LLC.ProductionProcess.productionProcess.standardization.payload.nanofiltration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NanoProcessDto {
    private Integer feedFlow;
    private Double inFilterPressure;
    private Double outFilterPressure;
    private Double inletPressure;
    private Double firstStepPressure;
    private Double secondStepPressure;
    private Integer bapPowerPercentage;
    private Integer firstStepPermeateFlow;
    private Double firstStepPermeateConcentration;
    private Integer secondStepPermeateFlow;
    private Double secondStepPermeateConcentration;
    private Integer thirdStepPermeateFlow;
    private Double thirdStepPermeateConcentration;
    private Integer fourthStepPermeateFlow;
    private Double fourthStepPermeateConcentration;
    private Double finalPermeateConcentration;
    private Integer productFlow;
}
