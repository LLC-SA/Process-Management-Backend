package com.LLC.ProductionProcess.productionProcess.storage.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PowderToStorageDto {
    private Integer crystallizerBatch;
    private Integer productType;
    private String diskQuality;
    private String visualAspectQuality;
    private Double productHumidity;
    private Double productPh;
    private String thermalStability;
}
