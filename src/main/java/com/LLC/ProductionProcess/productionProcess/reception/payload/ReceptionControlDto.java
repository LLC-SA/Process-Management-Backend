package com.LLC.ProductionProcess.productionProcess.reception.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceptionControlDto {
    private LocalDate inputDate;
    private String supplier;
    private Integer dispatchNumber;
    private String shipmentCompany;
    private String trucker;
    private String truckPatent;
    private LocalTime arrivedTime;
    private Boolean hasSeals;
    private Boolean isCleaned;
    private Integer dischargedVolume;
    private String productType;
    private Double concentration;
    private Double temperature;
    private Double pH;
    private Integer acidity;
    private Double density;
    private Boolean hasAntibiotics;
    private Integer peroxideValue;
    private String siloDestination;
    private String observations;
}
