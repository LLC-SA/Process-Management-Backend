package com.LLC.ProductionProcess.productionProcess.cip_checks.entity;

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
@Table(name = "cip_equipos")
public class EquipmentCip extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "equipo")
    private String equipment;

    @Column(name = "tipo_cip")
    private String cipType;

    @Column(name = "concentración")
    private Double cipConcentration;

    @Column(name = "pH_solución")
    private Double cipPh;

    @Column(name = "caudal")
    private Integer flowRate;

    @Column(name = "temperatura")
    private Integer cipTemperature;

    @Column(name = "tiempo")
    private Integer cipTime;
    
    @Column(name = "desinfección")
    private Boolean isDesinfected;

    public EquipmentCip(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                        String equipment, String cipType, Double cipConcentration,
                        Integer flowRate, Integer cipTemperature, Integer cipTime,
                        Double cipPh, Boolean isDesinfected) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.equipment = equipment;
        this.cipType = cipType;
        this.cipConcentration = cipConcentration;
        this.flowRate = flowRate;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
        this.cipPh = cipPh;
        this.isDesinfected = isDesinfected;
    }
}

