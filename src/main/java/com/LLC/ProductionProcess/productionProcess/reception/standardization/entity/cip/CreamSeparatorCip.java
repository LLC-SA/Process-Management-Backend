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
@Table(name = "cip_desnatadora")
public class CreamSeparatorCip extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private LocalTime inputTime;
    private String cipType;
    private Double cipConcentration;
    private Integer cipTemperature;
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

