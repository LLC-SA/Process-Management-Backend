package com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentCrystDto {
    private Long id;
    private Integer batchNumber;
    private String crystallizerNumber;
    private String checkedOrDisinfected;
    private String productType;
    private String d90BatchId;
    private String crystallizerOrigin;
    private Double concentratepH;
    private Integer acidity;
    private Integer crystallizerVolume;
}
