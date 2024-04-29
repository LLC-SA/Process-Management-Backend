package com.LLC.ProductionProcess.productionProcess.standardization.entity.nanofiltration;

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
@Table(name = "nano_proceso")
public class NanoProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "caudal_alimentación")
    private Integer feedFlow;

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

    @Column(name = "caudal_producto")
    private Integer productFlow;

    public NanoProcess(@NotNull String createdBy, Integer feedFlow, Double inFilterPressure, Double outFilterPressure,
                       Double inletPressure, Double firstStepPressure, Double secondStepPressure, Integer bapPowerPercentage,
                       Integer firstStepPermeateFlow, Double firstStepPermeateConcentration, Integer secondStepPermeateFlow,
                       Double secondStepPermeateConcentration, Integer thirdStepPermeateFlow, Double thirdStepPermeateConcentration,
                       Integer fourthStepPermeateFlow, Double fourthStepPermeateConcentration,
                       Double finalPermeateConcentration, Integer productFlow) {
        super(createdBy);
        this.feedFlow = feedFlow;
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
        this.productFlow = productFlow;
    }
}
