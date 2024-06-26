package com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeparatorCreamDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private Integer binsNumber;
    private Integer binsQuantity;
}
