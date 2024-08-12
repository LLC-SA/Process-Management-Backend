package com.LLC.ProductionProcess.productionProcess.storage.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedControlDto {
    private LocalDate inputDate;
    private LocalTime inputTime;
    private String siloNumber;
    private String feedType;
    private Integer feedContainerVolume;
    private Double feedConcentration;
    private Double feedTemperature;
    private Double feedPh;
    private Integer feedAcidity;
    private String usedBy;
}
