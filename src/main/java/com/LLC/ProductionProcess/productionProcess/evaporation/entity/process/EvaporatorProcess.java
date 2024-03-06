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
@Table(name = "Evaporador_proceso")
public class EvaporatorProcess extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer effectOneTemp;
    private Integer effectTwoTemp;
    private Integer effectThreeTemp;
    private Double boilerSteamPressure;
    private Double evaporatorSteamPressure;
    private Integer coolingTowerIn;
    private Integer coolingTowerOut;
    private Integer flashTemp;
    private Integer vacuumPressure;
    private String productOutput;
    private Double productSolids;

    public EvaporatorProcess(String createdBy, Integer effectOneTemp, Integer effectTwoTemp,
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
