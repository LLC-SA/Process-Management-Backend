package com.LLC.ProductionProcess.productionProcess.crystallizers.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cristalizador_estado")
public class CrystallizerState extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private String crystallizerNumber;
    private LocalTime inputTime;
    private Integer crystallizerVolume;
    private String productType;
    private Integer batchNumber;
    private Integer concentration;
    private Integer temperature;
    private Double pH;
    private Integer acidity;

    // Spray
    private Double totalSolids;

    public CrystallizerState(@NotNull String createdBy, LocalDate inputDate, String crystallizerNumber,
                             LocalTime inputTime, Integer crystallizerVolume, String productType,
                             Integer batchNumber, Integer concentration, Integer temperature,
                             Double pH, Integer acidity, Double totalSolids) {
        super(createdBy);
        this.inputDate = inputDate;
        this.crystallizerNumber = crystallizerNumber;
        this.inputTime = inputTime;
        this.crystallizerVolume = crystallizerVolume;
        this.productType = productType;
        this.batchNumber = batchNumber;
        this.concentration = concentration;
        this.temperature = temperature;
        this.pH = pH;
        this.acidity = acidity;
        this.totalSolids = totalSolids;
    }
}
