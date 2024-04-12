package com.LLC.ProductionProcess.productionProcess.evaporation.entity.process;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "evaporador_proceso")
public class EvapProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "temperatura_efecto_uno")
    private Integer effectOneTemp;

    @Column(name = "temperatura_efecto_dos")
    private Integer effectTwoTemp;

    @Column(name = "temperatura_efecto_tres")
    private Integer effectThreeTemp;

    @Column(name = "presión_caldera")
    private Double boilerSteamPressure;

    @Column(name = "presión_termocompresor")
    private Double evaporatorSteamPressure;

    @Column(name = "temperatura_ingreso_torre")
    private Integer coolingTowerIn;

    @Column(name = "temperatura_egreso_torre")
    private Integer coolingTowerOut;

    @Column(name = "temperatura_flash")
    private Integer flashTemp;

    @Column(name = "vacío")
    private Integer vacuumPressure;

    @Column(name = "destino_producto")
    private String productOutput;

    @Column(name = "solidos_producto")
    private Double productSolids;

    public EvapProcess(String createdBy, Integer effectOneTemp, Integer effectTwoTemp,
                       Integer effectThreeTemp, Double boilerSteamPressure, Double evaporatorSteamPressure,
                       Integer coolingTowerIn, Integer coolingTowerOut, Integer flashTemp,
                       Integer vacuumPressure, String productOutput, Double productSolids) {
        super(createdBy);
        this.effectOneTemp = effectOneTemp;
        this.effectTwoTemp = effectTwoTemp;
        this.effectThreeTemp = effectThreeTemp;
        this.boilerSteamPressure = boilerSteamPressure;
        this.evaporatorSteamPressure = evaporatorSteamPressure;
        this.coolingTowerIn = coolingTowerIn;
        this.coolingTowerOut = coolingTowerOut;
        this.flashTemp = flashTemp;
        this.vacuumPressure = vacuumPressure;
        this.productOutput = productOutput;
        this.productSolids = productSolids;
    }
}
