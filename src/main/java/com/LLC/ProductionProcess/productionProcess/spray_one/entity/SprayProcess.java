package com.LLC.ProductionProcess.productionProcess.spray_one.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spray_1_proceso")
public class SprayProcess extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "horas_producción")
    private Integer productionHours;

    @Column(name = "volumen_cristalizador")
    private Integer currentContainerLevel;

    @Column(name = "limpieza_filtro")
    private Boolean isFilterCleaned;

    @Column(name = "temperatura_horno")
    private Integer heaterTemperature;

    @Column(name = "temperatura_secado")
    private Integer dryerTemperature;

    @Column(name = "presión_bomba_presurizadora")
    private Integer feedPumpPressure;

    @Column(name = "presión_bap")
    private Integer highPumpPressure;

    @Column(name = "rpm_bap")
    private Integer highPumpRPM;

    @Column(name = "temperatura_vibro_1_sensor_1")
    private Integer vibroOneTempOne;

    @Column(name = "temperatura_vibro_1_sensor_2")
    private Integer vibroOneTempTwo;

    @Column(name = "temperatura_vibro_2_sensor_1")
    private Integer vibroTwoTempOne;

    @Column(name = "temperatura_vibro_2_sensor_2")
    private Integer vibroTwoTempTwo;

    @Column(name = "temperatura_vibro_2_sensor_3")
    private Integer vibroTwoTempThree;

    @Column(name = "toberas_cantidad")
    private Integer nozzleQuantity;

    public SprayProcess(@NotNull String createdBy, Integer productionHours, Integer currentContainerLevel,
                        Boolean isFilterCleaned, Integer heaterTemperature, Integer dryerTemperature,
                        Integer feedPumpPressure, Integer highPumpPressure, Integer highPumpRPM,
                        Integer vibroOneTempOne, Integer vibroOneTempTwo, Integer vibroTwoTempOne,
                        Integer vibroTwoTempTwo, Integer vibroTwoTempThree, Integer nozzleQuantity) {
        super(createdBy);
        this.productionHours = productionHours;
        this.currentContainerLevel = currentContainerLevel;
        this.isFilterCleaned = isFilterCleaned;
        this.heaterTemperature = heaterTemperature;
        this.dryerTemperature = dryerTemperature;
        this.feedPumpPressure = feedPumpPressure;
        this.highPumpPressure = highPumpPressure;
        this.highPumpRPM = highPumpRPM;
        this.vibroOneTempOne = vibroOneTempOne;
        this.vibroOneTempTwo = vibroOneTempTwo;
        this.vibroTwoTempOne = vibroTwoTempOne;
        this.vibroTwoTempTwo = vibroTwoTempTwo;
        this.vibroTwoTempThree = vibroTwoTempThree;
        this.nozzleQuantity = nozzleQuantity;
    }
}
