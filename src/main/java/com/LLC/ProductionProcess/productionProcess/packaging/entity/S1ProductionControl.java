package com.LLC.ProductionProcess.productionProcess.packaging.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Envase_control_uno")
public class S1ProductionControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String warehousePlace;
    // PRODUCT //
    private String productType;
    private Integer crystallizerBatch;
    private Integer productBatch;
    private Integer productInternalCode;
    private String diskQuality;
    private String visualAspectQuality;
    private String thermalStability;
    // BAGS //
    private Integer palletNumber;
    private Integer numberInPallet;
    private String bagType;
    private String bagBatch;
    private String operatorInPackingMachine;
    private String observations;

    public S1ProductionControl(@NotNull String createdBy, String warehousePlace,
                               String productType, Integer crystallizerBatch, Integer productBatch,
                               Integer productInternalCode, String diskQuality, String visualAspectQuality,
                               String thermalStability, Integer palletNumber, Integer numberInPallet,
                               String bagType, String bagBatch, String operatorInPackingMachine,
                               String observations) {
        super(createdBy);
        this.warehousePlace = warehousePlace;
        this.productType = productType;
        this.crystallizerBatch = crystallizerBatch;
        this.productBatch = productBatch;
        this.productInternalCode = productInternalCode;
        this.diskQuality = diskQuality;
        this.visualAspectQuality = visualAspectQuality;
        this.thermalStability = thermalStability;
        this.palletNumber = palletNumber;
        this.numberInPallet = numberInPallet;
        this.bagType = bagType;
        this.bagBatch = bagBatch;
        this.operatorInPackingMachine = operatorInPackingMachine;
        this.observations = observations;
    }
}
