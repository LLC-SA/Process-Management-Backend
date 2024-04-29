package com.LLC.ProductionProcess.productionProcess.packaging.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "envase_uno_verificación")
public class WeightControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_ingreso")
    private LocalDate inputDate;

    @Column(name = "hora_realización")
    private LocalTime inputTime;

    @Column(name = "balanza_número")
    private Integer balanceNumber;

    @Column(name = "peso_controlado")
    private Double bagWeight;

    @Column(name = "observación")
    private String observations;

    public WeightControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                         Integer balanceNumber, Double bagWeight, String observations) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.balanceNumber = balanceNumber;
        this.bagWeight = bagWeight;
        this.observations = observations;
    }
}
