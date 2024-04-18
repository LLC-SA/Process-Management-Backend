package com.LLC.ProductionProcess.productionProcess.packaging.payload;

import java.time.LocalDate;
import java.time.LocalTime;

public class PackingProcessOneDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String warehousePlace;
    private String productType;
    private Integer crystallizerBatch;
    private Integer productBatch;
    private Integer productInternalCode;
    private String diskQuality;
    private String visualAspectQuality;
    private String thermalStability;
    private Integer palletNumber;
    private Integer numberInPallet;
    private String bagType;
    private String bagBatch;
    private String operatorInPackingMachine;
    private String observations;
}
