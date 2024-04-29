package com.LLC.ProductionProcess.productionProcess.packaging.payload;

import java.time.LocalDate;
import java.time.LocalTime;

public class PackingControlOneDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String warehousePlace;
    private Integer productBatch;
    private Integer productInternalCode;
    private Integer palletNumber;
    private Integer numberInPallet;
    private String bagType;
    private String bagBatch;
    private String operatorInPackingMachine;
    private String observations;
}
