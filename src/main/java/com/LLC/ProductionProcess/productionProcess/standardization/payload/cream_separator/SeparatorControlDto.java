package com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SeparatorControlDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String processType;
    private String feedOrigin;
    private Integer feedContainerLevel;
    private String productDestination;
    private String productDestinationContainerLevel;
}
