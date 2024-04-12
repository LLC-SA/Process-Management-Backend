package com.LLC.ProductionProcess.productionProcess.packaging.entity;

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
@Table(name = "envase_1_control_proceso")
public class PackingControlOne extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "sección_en_depósito")
    private String warehousePlace;

    // PRODUCT //
    @Column(name = "tipo_producto")
    private String productType;

    @Column(name = "batch")
    private Integer crystallizerBatch;

    @Column(name = "lote")
    private Integer productBatch;

    @Column(name = "código_interno")
    private Integer productInternalCode;

    @Column(name = "disco")
    private String diskQuality;

    @Column(name = "aspecto_visual")
    private String visualAspectQuality;

    @Column(name = "estabilidad_térmica")
    private String thermalStability;

    // BAGS //
    @Column(name = "palé_número")
    private Integer palletNumber;

    @Column(name = "palé_cantidad_bolsas")
    private Integer numberInPallet;

    @Column(name = "bolsa_tipo")
    private String bagType;

    @Column(name = "bolsa_lote")
    private String bagBatch;

    @Column(name = "operador_envasado")
    private String operatorInPackingMachine;

    @Column(name = "observación")
    private String observations;

    public PackingControlOne(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                             String warehousePlace, String productType, Integer crystallizerBatch,
                             Integer productBatch, Integer productInternalCode, String diskQuality,
                             String visualAspectQuality, String thermalStability, Integer palletNumber,
                             Integer numberInPallet, String bagType, String bagBatch,
                             String operatorInPackingMachine, String observations) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
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
