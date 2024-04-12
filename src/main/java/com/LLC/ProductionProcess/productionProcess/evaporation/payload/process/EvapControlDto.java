package com.LLC.ProductionProcess.productionProcess.evaporation.payload.process;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EvapControlDto {
    private LocalTime inputTime;
    private LocalDate inputDate;
    private String processOrigin;
    private String processDescription;
    private String processDestination;
    private Integer flowValue;
}
