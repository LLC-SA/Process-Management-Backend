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
@Table(name = "recepción_filtros_verificación")
public class FilterCheck extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private LocalTime inputTime;
    private Integer filterNumber;
    private Boolean isIntegral;
    private Boolean hasFindings;
    private Boolean isDisinfectSolutionChanged;
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
