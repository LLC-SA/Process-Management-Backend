package com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "evaporador_llenado_cristalizador_detalles")
public class EvapCrystallizerItem extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime inputTime;
    private Double pasteurizationTemperature;
    private Double productConcentration;
    private Integer coolingTemperature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evaporation_crystallizer_id")
    private EvapCrystallizer evapCrystallizer;

    public EvapCrystallizerItem(@NotNull String createdBy, LocalTime inputTime,
                                Double pasteurizationTemperature, Double productConcentration,
                                Integer coolingTemperature) {
        super(createdBy);
        this.inputTime = inputTime;
        this.pasteurizationTemperature = pasteurizationTemperature;
        this.productConcentration = productConcentration;
        this.coolingTemperature = coolingTemperature;
    }
}
