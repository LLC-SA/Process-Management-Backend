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
@Table(name = "silos_control")
public class SiloControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "silo_número")
    private String siloNumber;

    @Column(name = "volumen")
    private Integer containerVolume;

    @Column(name = "tipo_producto")
    private String productType;

    @Column(name = "concentración")
    private Double concentration;

    @Column(name = "temperatura")
    private Double temperature;

    @Column(name = "pH")
    private Double pH;

    @Column(name = "acidez")
    private Integer acidity;

    public SiloControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                       String siloNumber, Integer containerVolume, String productType,
                       Double concentration, Double temperature, Double pH, Integer acidity) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.siloNumber = siloNumber;
        this.containerVolume = containerVolume;
        this.productType = productType;
        this.concentration = concentration;
        this.temperature = temperature;
        this.pH = pH;
        this.acidity = acidity;
    }
}
