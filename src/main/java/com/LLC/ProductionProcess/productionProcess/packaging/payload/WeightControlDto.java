package com.LLC.ProductionProcess.productionProcess.packaging.payload;

import java.time.LocalDate;
import java.time.LocalTime;

public class WeightControlDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private Integer balanceNumber;
    private Double bagWeight;
    private String observations;
}
