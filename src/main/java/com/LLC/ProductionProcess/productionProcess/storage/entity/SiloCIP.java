package com.LLC.ProductionProcess.productionProcess.storage.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cip_silos")
public class SiloCIP extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "tipo")
    private String cipType;

    @Column(name = "concentración")
    private Double cipConcentration;

    @Column(name = "temperatura")
    private Integer cipTemperature;

    @Column(name = "cip_tiempo")
    private Integer cipTime;

    @Column(name = "observación")
    private String observations;

    public SiloCIP(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                   String cipType, Double cipConcentration, Integer cipTemperature,
                   Integer cipTime, String observations) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.cipType = cipType;
        this.cipConcentration = cipConcentration;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
        this.observations = observations;
    }
}
