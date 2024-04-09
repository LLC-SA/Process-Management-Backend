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
@Table(name = "envase_control_pesados")
public class WeightControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private LocalTime inputTime;
    private Integer balanceNumber;
    private Double bagWeight;
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
