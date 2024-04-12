package com.LLC.ProductionProcess.productionProcess.standardization.entity.process;

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
@Table(name = "Nanofiltración_proceso")
public class NanoProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /* FEED */
    @Column(name = "horas_producción")
    private Integer productionHours;

    @Column(name = "alimentación")
    private String feedOrigin;

    @Column(name = "volumen")
    private Integer feedContainerLevel;

    @Column(name = "caudal")
    private Integer feedFlow;

    @Column(name = "pH")
    private Integer feedPh;

    @Column(name = "concentración_alimentación")
    private Double feedConcentration;

    @Column(name = "turbidez")
    private Integer feedTurbidity;

    @Column(name = "temperatura")
    private Integer feedTemperature;

    /* PROCESS */
    @Column(name = "presión_filtros_ingreso")
    private Double inFilterPressure;

    @Column(name = "presión_filtros_egreso")
    private Double outFilterPressure;

    @Column(name = "presión_alimentación")
    private Double inletPressure;

    @Column(name = "presión_etapa_uno")
    private Double firstStepPressure;

    @Column(name = "presión_etapa_dos")
    private Double secondStepPressure;

    @Column(name = "bap_potencia")
    private Integer bapPowerPercentage;

    @Column(name = "flujo_permeado_etapa_1")
    private Integer firstStepPermeateFlow;

    @Column(name = "concentración_permeado_etapa_1")
    private Double firstStepPermeateConcentration;

    @Column(name = "flujo_permeado_etapa_2")
    private Integer secondStepPermeateFlow;

    @Column(name = "concentración_permeado_etapa_2")
    private Double secondStepPermeateConcentration;

    @Column(name = "flujo_permeado_etapa_3")
    private Integer thirdStepPermeateFlow;

    @Column(name = "concentración_permeado_etapa_3")
    private Double thirdStepPermeateConcentration;

    @Column(name = "flujo_permeado_etapa_4")
    private Integer fourthStepPermeateFlow;

    @Column(name = "concentración_permeado_etapa_4")
    private Double fourthStepPermeateConcentration;

    @Column(name = "concentración_permeado_promedio")
    private Double finalPermeateConcentration;

    public NanoProcess(@NotNull String createdBy, Integer productionHours, String feedOrigin,
                       Integer feedContainerLevel, Integer feedFlow, Integer feedPh,
                       Double feedConcentration, Integer feedTurbidity, Integer feedTemperature,
                       Double inFilterPressure, Double outFilterPressure, Double inletPressure,
                       Double firstStepPressure, Double secondStepPressure, Integer bapPowerPercentage,
                       Integer firstStepPermeateFlow, Double firstStepPermeateConcentration,
                       Integer secondStepPermeateFlow, Double secondStepPermeateConcentration,
                       Integer thirdStepPermeateFlow, Double thirdStepPermeateConcentration,
                       Integer fourthStepPermeateFlow, Double fourthStepPermeateConcentration,
                       Double finalPermeateConcentration) {
        super(createdBy);
        this.productionHours = productionHours;
        this.feedOrigin = feedOrigin;
        this.feedContainerLevel = feedContainerLevel;
        this.feedFlow = feedFlow;
        this.feedPh = feedPh;
        this.feedConcentration = feedConcentration;
        this.feedTurbidity = feedTurbidity;
        this.feedTemperature = feedTemperature;
        this.inFilterPressure = inFilterPressure;
        this.outFilterPressure = outFilterPressure;
        this.inletPressure = inletPressure;
        this.firstStepPressure = firstStepPressure;
        this.secondStepPressure = secondStepPressure;
        this.bapPowerPercentage = bapPowerPercentage;
        this.firstStepPermeateFlow = firstStepPermeateFlow;
        this.firstStepPermeateConcentration = firstStepPermeateConcentration;
        this.secondStepPermeateFlow = secondStepPermeateFlow;
        this.secondStepPermeateConcentration = secondStepPermeateConcentration;
        this.thirdStepPermeateFlow = thirdStepPermeateFlow;
        this.thirdStepPermeateConcentration = thirdStepPermeateConcentration;
        this.fourthStepPermeateFlow = fourthStepPermeateFlow;
        this.fourthStepPermeateConcentration = fourthStepPermeateConcentration;
        this.finalPermeateConcentration = finalPermeateConcentration;
    }
}
