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

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "tipo_cip")
    private String cipType;

    @Column(name = "concentración")
    private Double cipConcentration;

    @Column(name = "temperatura")
    private Integer cipTemperature;

    @Column(name = "tiempo")
    private Integer cipTime;

    @Column(name = "caudal")
    private Integer cipFlow;

    @Column(name = "vacío")
    private Integer cipVaccum;

    @Column(name = "cip_evaporador")
    private Boolean isEvaporatorCleaned;

    @Column(name = "cip_pasteurizador")
    private Boolean isPasteurizerCleaned;

    @Column(name = "cip_separadores")
    private Boolean isSeparatorCleaned;

    @Column(name = "cip_flash")
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
