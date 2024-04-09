package com.LLC.ProductionProcess.productionProcess.spray_one.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import com.LLC.ProductionProcess.productionProcess.crystallizers.entity.CrystallizerState;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spray_control")
public class SprayControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String processOrigin;
    private String processDescription;

    @OneToOne
    @JoinColumn(name = "crystallizer_id")
    CrystallizerState crytallizerState;

    @OneToOne
    @JoinColumn(name = "sprayOne_equipment_id")
    SprayProcess sprayProcess;

    @OneToOne
    @JoinColumn(name = "sprayOne_product_id")
    SprayProduct sprayProduct;

    public SprayControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                        String processOrigin, String processDescription) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.processOrigin = processOrigin;
        this.processDescription = processDescription;
    }
}
