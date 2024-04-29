package com.LLC.ProductionProcess.productionProcess.storage.payload;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalTime;

public class ProductoToStorageDto {
    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "tipo")
    private Integer productType;

    @Column(name = "concentración")
    private String productConcentration;

    @Column(name = "temperatura")
    private Integer productTemperature;

    @Column(name = "pH")
    private Double productPh;

    @Column(name = "procesado_por")
    private String generatedBy;
}
