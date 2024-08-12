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
@Table(name = "cristalizador_llenado_detalle")
public class CurrentCrystItem extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hora_ingreso")
    private LocalTime inputTime;

    @Column(name = "temperatura_pasteurización")
    private Double pasteurizationTemperature;

    @Column(name = "concentración_producto")
    private Double productConcentration;

    @Column(name = "temperatura_enfriamiento")
    private Integer coolingTemperature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_evaporation_crystallizer_id")
    private CurrentCryst currentCryst;

    public CurrentCrystItem(@NotNull String createdBy, LocalTime inputTime,
                            Double pasteurizationTemperature, Double productConcentration,
                            Integer coolingTemperature) {
        super(createdBy);
        this.inputTime = inputTime;
        this.pasteurizationTemperature = pasteurizationTemperature;
        this.productConcentration = productConcentration;
        this.coolingTemperature = coolingTemperature;
    }
}
