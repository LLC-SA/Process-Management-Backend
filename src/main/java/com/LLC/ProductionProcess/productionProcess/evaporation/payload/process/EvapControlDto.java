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
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String processType;
    private String feedOrigin;
    private String productDestination;
}
