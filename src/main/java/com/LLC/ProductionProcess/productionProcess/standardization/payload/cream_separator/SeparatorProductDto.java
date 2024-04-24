package com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SeparatorProductDto {
    private Integer productType;
    private String productConcentration;
    private Integer productTemperature;
    private Double productPh;
}
