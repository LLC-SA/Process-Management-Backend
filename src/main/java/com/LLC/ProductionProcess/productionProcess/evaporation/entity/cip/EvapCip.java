package com.LLC.ProductionProcess.productionProcess.evaporation.entity.cip;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CIP_evaporador")
public class EvapCip extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cipType;
    private Double cipConcentration;
    private Integer cipTemperature;
    private Integer cipTime;
    private Integer cipFlow;
    private Integer cipVaccum;
    private Boolean isSeparatorCleaned;
    private Boolean cleanedFlash;

    public EvapCip(@NotNull String createdBy, String cipType,
                   Double cipConcentration, Integer cipTemperature,
                   Integer cipTime, Integer cipFlow, Integer cipVaccum,
                   Boolean isSeparatorCleaned, Boolean cleanedFlash) {
        super(createdBy);
        this.cipType = cipType;
        this.cipConcentration = cipConcentration;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
        this.cipFlow = cipFlow;
        this.cipVaccum = cipVaccum;
        this.isSeparatorCleaned = isSeparatorCleaned;
        this.cleanedFlash = cleanedFlash;
    }
}
