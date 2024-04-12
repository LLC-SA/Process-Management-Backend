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

    @Column(name = "fecha")
    private LocalDate inputDate;

    // TRUCK
    @Column(name = "proveedor")
    private String supplier;

    @Column(name = "remito")
    private Integer dispatchNumber;

    @Column(name = "transporte")
    private String shipmentCompany;

    @Column(name = "chofer")
    private String trucker;

    @Column(name = "patente")
    private String truckPatent;

    @Column(name = "hora_llegada")
    private LocalTime arrivedTime;

    @Column(name = "precintos")
    private Boolean hasSeals;

    @Column(name = "limpieza")
    private Boolean isCleaned;

    // VOLUME
    @Column(name = "volumen_descargado")
    private Integer dischargedVolume;

    // RAW MATERIAL
    @Column(name = "tipo_producto")
    private String productType;

    @Column(name = "concentración")
    private Double concentration;

    @Column(name = "temperatura")
    private Double temperature;

    @Column(name = "pH")
    private Double pH;

    @Column(name = "acidez")
    private Integer acidity;

    @Column(name = "densidad")
    private Double density;

    @Column(name = "antibióticos")
    private Boolean hasAntibiotics;

    @Column(name = "peróxidos")
    private Integer peroxideValue;

    @Column(name = "silo_destino")
    private String siloDestination;

    // OTHERS
    @Column(name = "observación")
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
