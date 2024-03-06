package com.LLC.ProductionProcess.productionProcess.standardization.entity.process;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Nanofiltración_proceso")
public class NanoProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /* FEED */
    private Integer productionHours;
    private String feedOrigin;
    private Integer feedContainerLevel;
    private Integer feedFlow;
    private Integer feedPh;
    private Double feedConcentration;
    private Integer feedTurbidity;
    private Integer feedTemperature;
    /* PROCESS */
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

    public NanoProcess(@NotNull String createdBy, Integer productionHours, String feedOrigin,
                       Integer feedContainerLevel, Integer feedFlow, Integer feedPh,
                       Double feedConcentration, Integer feedTurbidity, Integer feedTemperature,
                       Double inFilterPressure, Double outFilterPressure, Double inletPressure,
                       Double firstStepPressure, Double secondStepPressure, Integer bapPowerPercentage,
                       Integer firstStepPermeateFlow, Double firstStepPermeateConcentration,
                       Integer secondStepPermeateFlow, Double secondStepPermeateConcentration,
                       Integer thirdStepPermeateFlow, Double thirdStepPermeateConcentration,
                       Integer fourthStepPermeateFlow, Double fourthStepPermeateConcentration,
                       Double finalPermeateConcentration) {
        super(createdBy);
        this.productionHours = productionHours;
        this.feedOrigin = feedOrigin;
        this.feedContainerLevel = feedContainerLevel;
        this.feedFlow = feedFlow;
        this.feedPh = feedPh;
        this.feedConcentration = feedConcentration;
        this.feedTurbidity = feedTurbidity;
        this.feedTemperature = feedTemperature;
        this.inFilterPressure = inFilterPressure;
        this.outFilterPressure = outFilterPressure;
        this.inletPressure = inletPressure;
        this.firstStepPressure = firstStepPressure;
        this.secondStepPressure = secondStepPressure;
        this.bapPowerPercentage = bapPowerPercentage;
        this.firstStepPermeateFlow = firstStepPermeateFlow;
        this.firstStepPermeateConcentration = firstStepPermeateConcentration;
        this.secondStepPermeateFlow = secondStepPermeateFlow;
        this.secondStepPermeateConcentration = secondStepPermeateConcentration;
        this.thirdStepPermeateFlow = thirdStepPermeateFlow;
        this.thirdStepPermeateConcentration = thirdStepPermeateConcentration;
        this.fourthStepPermeateFlow = fourthStepPermeateFlow;
        this.fourthStepPermeateConcentration = fourthStepPermeateConcentration;
        this.finalPermeateConcentration = finalPermeateConcentration;
    }
}
