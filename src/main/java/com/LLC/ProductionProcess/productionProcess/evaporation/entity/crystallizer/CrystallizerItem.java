package com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer;

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
@Table(name = "Cristalizadores_detalles")
public class CrystallizerItem extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double pasteurizationTemperature;
    private Double productConcentration;
    private Integer coolingTemperature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evaporation_crystallizer_id")
    private Crystallizer crystallizer;

    public CrystallizerItem(@NotNull String createdBy, Double pasteurizationTemperature,
                            Double productConcentration, Integer coolingTemperature) {
        super(createdBy);
        this.pasteurizationTemperature = pasteurizationTemperature;
        this.productConcentration = productConcentration;
        this.coolingTemperature = coolingTemperature;
    }
}
