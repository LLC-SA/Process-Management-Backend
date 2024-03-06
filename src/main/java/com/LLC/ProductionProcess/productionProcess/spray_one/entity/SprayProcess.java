package com.LLC.ProductionProcess.productionProcess.spray_one.entity;

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
@Table(name = "Spray_proceso")
public class SprayProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public SprayProcess(@NotNull String createdBy, Integer productionHours, Integer currentContainerLevel,
                        Boolean isFilterCleaned, Integer heaterTemperature, Integer dryerTemperature,
                        Integer feedPumpPressure, Integer highPumpPressure, Integer highPumpRPM,
                        Integer vibroOneTempOne, Integer vibroOneTempTwo, Integer vibroTwoTempOne,
                        Integer vibroTwoTempTwo, Integer vibroTwoTempThree, Integer nozzleQuantity) {
        super(createdBy);
        this.productionHours = productionHours;
        this.currentContainerLevel = currentContainerLevel;
        this.isFilterCleaned = isFilterCleaned;
        this.heaterTemperature = heaterTemperature;
        this.dryerTemperature = dryerTemperature;
        this.feedPumpPressure = feedPumpPressure;
        this.highPumpPressure = highPumpPressure;
        this.highPumpRPM = highPumpRPM;
        this.vibroOneTempOne = vibroOneTempOne;
        this.vibroOneTempTwo = vibroOneTempTwo;
        this.vibroTwoTempOne = vibroTwoTempOne;
        this.vibroTwoTempTwo = vibroTwoTempTwo;
        this.vibroTwoTempThree = vibroTwoTempThree;
        this.nozzleQuantity = nozzleQuantity;
    }
}
