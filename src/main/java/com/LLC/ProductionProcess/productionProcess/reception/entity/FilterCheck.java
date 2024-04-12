package com.LLC.ProductionProcess.productionProcess.reception.entity;

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
@Table(name = "recepción_filtros")
public class FilterCheck extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "filtro_número")
    private Integer filterNumber;

    @Column(name = "integridad")
    private Boolean isIntegral;

    @Column(name = "hallazgos")
    private Boolean hasFindings;

    @Column(name = "cambio_desinfectante")
    private Boolean isDisinfectSolutionChanged;

    @Column(name = "observación")
    private String observations;

    public FilterCheck(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                       Integer filterNumber, Boolean isIntegral, Boolean hasFindings,
                       Boolean isDisinfectSolutionChanged, String observations) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.filterNumber = filterNumber;
        this.isIntegral = isIntegral;
        this.hasFindings = hasFindings;
        this.isDisinfectSolutionChanged = isDisinfectSolutionChanged;
        this.observations = observations;
    }
}
