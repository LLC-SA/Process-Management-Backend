package com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator;

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
@Table(name = "desnatadora_proceso")
public class CreamSeparatorProcess extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "caudal")
    private Integer feedFlow;

    @Column(name = "contrapresión")
    private Double feedBackPressure;

    @Column(name = "funcionamiento_descarga")
    private Boolean isSeparatorDischargeWorking;

    public CreamSeparatorProcess(@NotNull String createdBy, Integer feedFlow, Double feedBackPressure, Boolean isSeparatorDischargeWorking) {
        super(createdBy);
        this.feedFlow = feedFlow;
        this.feedBackPressure = feedBackPressure;
        this.isSeparatorDischargeWorking = isSeparatorDischargeWorking;
    }
}
