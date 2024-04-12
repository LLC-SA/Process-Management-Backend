package com.LLC.ProductionProcess.productionProcess.standardization.entity.process.cream_separator;

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
@Table(name = "desnatadora_proceso")
public class CreamSeparatorProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "horas_producción")
    private Integer productionHours;

    @Column(name = "alimentación")
    private String feedOrigin;

    @Column(name = "volumen")
    private Integer feedContainerLevel;

    @Column(name = "caudal")
    private Integer feedFlow;

    @Column(name = "destino")
    private String feedDestination;

    @Column(name = "contrapresión")
    private Double feedBackPressure;

    @Column(name = "temperatura")
    private Integer feedTemperature;

    @Column(name = "funcionamiento_descarga")
    private Boolean isSeparatorDischargeWorking;

    public CreamSeparatorProcess(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                                 Integer productionHours, String feedOrigin, Integer feedContainerLevel,
                                 Integer feedFlow, String feedDestination, Double feedBackPressure,
                                 Integer feedTemperature, Boolean isSeparatorDischargeWorking) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.productionHours = productionHours;
        this.feedOrigin = feedOrigin;
        this.feedContainerLevel = feedContainerLevel;
        this.feedFlow = feedFlow;
        this.feedDestination = feedDestination;
        this.feedBackPressure = feedBackPressure;
        this.feedTemperature = feedTemperature;
        this.isSeparatorDischargeWorking = isSeparatorDischargeWorking;
    }
}
