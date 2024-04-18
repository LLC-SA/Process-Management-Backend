package com.LLC.ProductionProcess.productionProcess.packaging.payload;

import java.time.LocalDate;
import java.time.LocalTime;

public class PCCControlDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String packingType;
    private Boolean vibratingSifterIntegrity;
    private Boolean magnetControl;
    private Boolean feControl;
    private Boolean noFeControl;
    private Boolean inoxControl;
    private String observations;
}
