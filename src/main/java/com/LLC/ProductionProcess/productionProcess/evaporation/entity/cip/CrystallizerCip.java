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
@Table(name = "CIP_cristalizadores")
public class CrystallizerCip extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cipType;
    private Double cipConcentration;
    private Integer cipTemperature;
    private Integer cipTime;

    public CrystallizerCip(@NotNull String createdBy, String cipType,
                           Double cipConcentration, Integer cipTemperature,
                           Integer cipTime) {
        super(createdBy);
        this.cipType = cipType;
        this.cipConcentration = cipConcentration;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
    }
}
