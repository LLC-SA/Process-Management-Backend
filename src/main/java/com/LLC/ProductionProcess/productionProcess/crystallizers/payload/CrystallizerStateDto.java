package com.LLC.ProductionProcess.productionProcess.crystallizers.payload;

import java.time.LocalDate;
import java.time.LocalTime;

public class CrystallizerStateDto {
    private LocalDate inputDate;
    private String crystallizerNumber;
    private LocalTime inputTime;
    private Integer crystallizerVolume;
    private String productType;
    private Integer batchNumber;
    private Integer concentration;
    private Integer temperature;
    private Double pH;
    private Integer acidity;
    private Double totalSolids;
}
