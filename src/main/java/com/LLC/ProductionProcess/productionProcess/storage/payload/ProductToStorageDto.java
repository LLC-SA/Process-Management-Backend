package com.LLC.ProductionProcess.productionProcess.storage.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductToStorageDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private Integer productType;
    private String productConcentration;
    private Integer productTemperature;
    private Double productPh;
    private String generatedBy;
}
