package com.LLC.ProductionProcess.productionProcess.standardization.entity.cip;

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

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "tipo")
    private String cipType;

    @Column(name = "temperatura")
    private Integer cipTemperature;

    @Column(name = "tiempo")
    private Integer cipTime;

    @Column(name = "pH")
    private Double cipPh;

    @Column(name = "presión_ingreso")
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
