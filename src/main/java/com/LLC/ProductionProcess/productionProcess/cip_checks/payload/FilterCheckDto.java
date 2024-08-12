package com.LLC.ProductionProcess.productionProcess.cip_checks.payload;

import java.time.LocalDate;
import java.time.LocalTime;

public class FilterCheckDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String equipment;
    private Integer filterNumber;
    private Boolean isIntegral;
    private Boolean hasFindings;
    private String observations;
}
