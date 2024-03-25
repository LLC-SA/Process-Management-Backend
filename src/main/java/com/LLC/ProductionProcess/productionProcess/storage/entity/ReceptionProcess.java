package com.LLC.ProductionProcess.productionProcess.storage.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Recepción_materia_prima")
public class ReceptionProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TRUCK
    private String supplier;
    private Integer dispatchNumber;
    private String shipmentCompany;
    private String trucker;
    private String truckPatent;
    private LocalTime arrivedTime;
    private Boolean hasSeals;
    private Boolean isCleaned;

    // VOLUME
    private Integer dischargedVolume;

    // RAW MATERIAL
    private String productType;
    private Double concentration;
    private Double temperature;
    private Double pH;
    private Integer acidity;
    private Double density;
    private Boolean hasAntibiotics;
    private Integer peroxideValue;
    private String siloDestination;

    // OTHERS
    private String observations;

}
