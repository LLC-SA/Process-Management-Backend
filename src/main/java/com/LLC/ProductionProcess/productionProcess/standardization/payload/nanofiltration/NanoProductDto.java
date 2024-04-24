package com.LLC.ProductionProcess.productionProcess.standardization.payload.nanofiltration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NanoProductDto {
    private Integer productType;
    private String productConcentration;
    private Integer productTemperature;
    private Double productPh;
}
