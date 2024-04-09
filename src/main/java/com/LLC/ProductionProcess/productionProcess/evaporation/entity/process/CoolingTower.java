package com.LLC.ProductionProcess.productionProcess.evaporation.entity.process;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "torres_enfriamiento_estado")
public class CoolingTower extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private Integer saltConcentration;
    private Boolean isWaterChanged;

    public CoolingTower(@NotNull String createdBy, LocalDate inputDate,
                        Integer saltConcentration, Boolean isWaterChanged) {
        super(createdBy);
        this.inputDate = inputDate;
        this.saltConcentration = saltConcentration;
        this.isWaterChanged = isWaterChanged;
    }
}
