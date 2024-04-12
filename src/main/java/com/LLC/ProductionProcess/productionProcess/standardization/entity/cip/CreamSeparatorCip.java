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
@Table(name = "cip_desnatadora")
public class CreamSeparatorCip extends BaseDateEntity {

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

    @Column(name = "tiempo")
    private Integer cipTime;

    public CreamSeparatorCip(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime, String cipType,
                             Double cipConcentration, Integer cipTemperature, Integer cipTime) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.cipType = cipType;
        this.cipConcentration = cipConcentration;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
    }
}

