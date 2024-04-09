package com.LLC.ProductionProcess.productionProcess.evaporation.entity.cip;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "cip_evaporador")
public class EvapCip extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private LocalTime inputTime;
    private String cipType;
    private Double cipConcentration;
    private Integer cipTemperature;
    private Integer cipTime;
    private Integer cipFlow;
    private Integer cipVaccum;
    private Boolean isEvaporatorCleaned;
    private Boolean isPasteurizerCleaned;
    private Boolean isSeparatorCleaned;
    private Boolean isFlashCleaned;

    public EvapCip(@NotNull String createdBy, LocalDate inputDate,
                   LocalTime inputTime, String cipType, Double cipConcentration,
                   Integer cipTemperature, Integer cipTime, Integer cipFlow,
                   Integer cipVaccum, Boolean isEvaporatorCleaned, Boolean isPasteurizerCleaned,
                   Boolean isSeparatorCleaned, Boolean isFlashCleaned) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.cipType = cipType;
        this.cipConcentration = cipConcentration;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
        this.cipFlow = cipFlow;
        this.cipVaccum = cipVaccum;
        this.isEvaporatorCleaned = isEvaporatorCleaned;
        this.isPasteurizerCleaned = isPasteurizerCleaned;
        this.isSeparatorCleaned = isSeparatorCleaned;
        this.isFlashCleaned = isFlashCleaned;
    }
}
