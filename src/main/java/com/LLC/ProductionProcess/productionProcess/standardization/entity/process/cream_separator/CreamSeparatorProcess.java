package com.LLC.ProductionProcess.productionProcess.standardization.entity.process.cream_separator;

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
@Table(name = "Desnatadora_proceso")
public class CreamSeparatorProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer productionHours;
    private String feedOrigin;
    private Integer feedContainerLevel;
    private Integer feedFlow;
    private String feedDestination;
    private Double feedBackPressure;
    private Integer feedTemperature;
    private Boolean isSeparatorDischargeWorking;

    public CreamSeparatorProcess(@NotNull String createdBy, Integer productionHours, String feedOrigin,
                                 Integer feedContainerLevel, Integer feedFlow, String feedDestination,
                                 Double feedBackPressure, Integer feedTemperature, Boolean isSeparatorDischargeWorking) {
        super(createdBy);
        this.productionHours = productionHours;
        this.feedOrigin = feedOrigin;
        this.feedContainerLevel = feedContainerLevel;
        this.feedFlow = feedFlow;
        this.feedDestination = feedDestination;
        this.feedBackPressure = feedBackPressure;
        this.feedTemperature = feedTemperature;
        this.isSeparatorDischargeWorking = isSeparatorDischargeWorking;
    }
}
