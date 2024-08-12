package com.LLC.ProductionProcess.productionProcess.cip_checks.payload;

import java.time.LocalDate;
import java.time.LocalTime;

public class EquipmentCipDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String equipment;
    private String cipType;
    private Double cipConcentration;
    private Double cipPh;
    private Integer flowRate;
    private Integer cipTemperature;
    private Integer cipTime;
    private Boolean isDesinfected;
}
