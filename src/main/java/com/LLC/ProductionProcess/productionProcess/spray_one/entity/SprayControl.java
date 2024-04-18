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
@Table(name = "spray_uno_control")
public class SprayControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "origen_proceso")
    private String processOrigin;

    @Column(name = "descripción_proceso")
    private String processDescription;

    @Column(name = "destino_proceso")
    private String processDestination;

    @OneToOne
    @JoinColumn(name = "crystallizer_id")
    CrystallizerState crytallizerState;

    @OneToOne
    @JoinColumn(name = "sprayOne_process_id")
    SprayProcess sprayProcess;

    @OneToOne
    @JoinColumn(name = "sprayOne_product_id")
    SprayProduct sprayProduct;

    public SprayControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                        String processOrigin, String processDescription, String processDestination) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.processOrigin = processOrigin;
        this.processDescription = processDescription;
        this.processDestination = processDestination;
    }
}
