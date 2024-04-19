package com.LLC.ProductionProcess.productionProcess.spray_one.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SprayProductDto {
    private Integer productGenerated;
    private String diskQuality;
    private String visualAspectQuality;
    private Double productHumidity;
    private Double productPh;
    private String thermalStability;
}
