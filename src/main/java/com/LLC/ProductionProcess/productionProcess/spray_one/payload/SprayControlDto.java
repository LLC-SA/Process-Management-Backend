package com.LLC.ProductionProcess.productionProcess.spray_one.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SprayControlDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String processOrigin;
    private String processDescription;
    private String processDestination;
}
