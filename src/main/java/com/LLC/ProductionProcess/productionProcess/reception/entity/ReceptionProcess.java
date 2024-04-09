package com.LLC.ProductionProcess.productionProcess.reception.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recepción_materia_prima")
public class ReceptionProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate inputDate;

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

    public ReceptionProcess(@NotNull String createdBy, LocalDate inputDate, String supplier, Integer dispatchNumber,
                            String shipmentCompany, String trucker, String truckPatent,
                            LocalTime arrivedTime, Boolean hasSeals, Boolean isCleaned,
                            Integer dischargedVolume, String productType, Double concentration,
                            Double temperature, Double pH, Integer acidity, Double density,
                            Boolean hasAntibiotics, Integer peroxideValue, String siloDestination,
                            String observations) {
        super(createdBy);
        this.inputDate = inputDate;
        this.supplier = supplier;
        this.dispatchNumber = dispatchNumber;
        this.shipmentCompany = shipmentCompany;
        this.trucker = trucker;
        this.truckPatent = truckPatent;
        this.arrivedTime = arrivedTime;
        this.hasSeals = hasSeals;
        this.isCleaned = isCleaned;
        this.dischargedVolume = dischargedVolume;
        this.productType = productType;
        this.concentration = concentration;
        this.temperature = temperature;
        this.pH = pH;
        this.acidity = acidity;
        this.density = density;
        this.hasAntibiotics = hasAntibiotics;
        this.peroxideValue = peroxideValue;
        this.siloDestination = siloDestination;
        this.observations = observations;
    }
}
