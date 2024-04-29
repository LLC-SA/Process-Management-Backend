package com.LLC.ProductionProcess.productionProcess.spray_one.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import com.LLC.ProductionProcess.productionProcess.crystallizers.entity.CrystallizerState;
import com.LLC.ProductionProcess.productionProcess.storage.entity.PowderToStorage;
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
@Table(name = "spray_uno_control")
public class SprayControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "tipo_proceso")
    private String processType;

    @Column(name = "alimentación_proceso")
    private String feedOrigin;

    @Column(name = "destino_proceso")
    private String productDestination;

    @OneToOne
    @JoinColumn(name = "crystallizer_id")
    CrystallizerState crytallizerState;

    @OneToOne
    @JoinColumn(name = "sprayOne_process_id")
    SprayProcess sprayProcess;

    @OneToOne
    @JoinColumn(name = "sprayOne_product_id")
    PowderToStorage powderToStorage;

    public SprayControl(@NotNull String createdBy, LocalDate inputDate,
                        LocalTime inputTime, String feedOrigin,
                        String processType, String productDestination) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.feedOrigin = feedOrigin;
        this.processType = processType;
        this.productDestination = productDestination;
    }
}
