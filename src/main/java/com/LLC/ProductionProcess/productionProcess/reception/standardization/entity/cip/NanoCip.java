package com.LLC.ProductionProcess.productionProcess.reception.standardization.entity.cip;

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
@Table(name = "cip_nanofiltración")
public class NanoCip extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private LocalTime inputTime;
    private String cipType;
    private Integer cipTemperature;
    private Integer cipTime;
    private Double cipPh;
    private Integer cipPressure;

    public NanoCip(@NotNull String createdBy, LocalDate inputDate,
                   LocalTime inputTime, String cipType, Integer cipTemperature,
                   Integer cipTime, Double cipPh, Integer cipPressure) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.cipType = cipType;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
        this.cipPh = cipPh;
        this.cipPressure = cipPressure;
    }
}
