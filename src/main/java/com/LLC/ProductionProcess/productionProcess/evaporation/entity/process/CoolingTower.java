package com.LLC.ProductionProcess.productionProcess.evaporation.entity.process;

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
@Table(name = "Torres_enfriamiento_estado")
public class CoolingTower extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer saltConcentration;
    private Boolean isWaterChanged;

    public CoolingTower(@NotNull String createdBy,
                        Integer saltConcentration,
                        Boolean isWaterChanged) {
        super(createdBy);
        this.saltConcentration = saltConcentration;
        this.isWaterChanged = isWaterChanged;
    }
}
