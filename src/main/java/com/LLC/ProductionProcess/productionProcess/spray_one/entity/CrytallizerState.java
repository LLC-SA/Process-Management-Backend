package com.LLC.ProductionProcess.productionProcess.spray_one.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Spray_cristalizador")
public class CrytallizerState extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String spray;
    private Integer crystallyzerNumber;
    private Long batchNumber;
    private Integer crystallyzerContainerLevel;
    private Integer crystallyzerTemperature;
    private Integer crystallyzerAcidity;
    private Double crystallyzerPh;
    private Double crystallizerConcentration;
    private Double crystallizerTotalSolids;

    public CrytallizerState(@NotNull String createdBy, String spray, Integer crystallyzerNumber,
                            Long batchNumber, Integer crystallyzerContainerLevel,
                            Integer crystallyzerTemperature, Integer crystallyzerAcidity,
                            Double crystallyzerPh, Double crystallizerConcentration,
                            Double crystallizerTotalSolids) {
        super(createdBy);
        this.spray = spray;
        this.crystallyzerNumber = crystallyzerNumber;
        this.batchNumber = batchNumber;
        this.crystallyzerContainerLevel = crystallyzerContainerLevel;
        this.crystallyzerTemperature = crystallyzerTemperature;
        this.crystallyzerAcidity = crystallyzerAcidity;
        this.crystallyzerPh = crystallyzerPh;
        this.crystallizerConcentration = crystallizerConcentration;
        this.crystallizerTotalSolids = crystallizerTotalSolids;
    }
}
