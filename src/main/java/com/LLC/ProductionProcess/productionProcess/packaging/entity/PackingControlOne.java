package com.LLC.ProductionProcess.productionProcess.packaging.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import com.LLC.ProductionProcess.productionProcess.storage.entity.PowderToStorage;
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
@Table(name = "envase_uno_control")
public class PackingControlOne extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_ingreso")
    private LocalDate inputDate;

    @Column(name = "hora_realización")
    private LocalTime inputTime;

    @Column(name = "sección_depósito")
    private String warehousePlace;

    @Column(name = "lote_producto")
    private Integer productBatch;

    @Column(name = "código_interno_producto")
    private Integer productInternalCode;

    @Column(name = "palé_número")
    private Integer palletNumber;

    @Column(name = "palé_cantidad_bolsas")
    private Integer numberInPallet;

    @Column(name = "bolsa_tipo")
    private String bagType;

    @Column(name = "bolsa_lote")
    private String bagBatch;

    @Column(name = "operador_envase")
    private String operatorInPackingMachine;

    @Column(name = "observación")
    private String observations;

    @OneToOne
    @JoinColumn(name = "fk_packing_product_id")
    PowderToStorage powderToStorage;

    public PackingControlOne(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                             String warehousePlace, Integer productBatch, Integer productInternalCode,
                             Integer palletNumber, Integer numberInPallet, String bagType, String bagBatch,
                             String operatorInPackingMachine, String observations) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.warehousePlace = warehousePlace;
        this.productBatch = productBatch;
        this.productInternalCode = productInternalCode;
        this.palletNumber = palletNumber;
        this.numberInPallet = numberInPallet;
        this.bagType = bagType;
        this.bagBatch = bagBatch;
        this.operatorInPackingMachine = operatorInPackingMachine;
        this.observations = observations;
    }
}
