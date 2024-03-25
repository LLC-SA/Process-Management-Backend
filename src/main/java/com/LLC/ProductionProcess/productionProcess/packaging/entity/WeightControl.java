package com.LLC.ProductionProcess.productionProcess.packaging.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Envase_control_pesado")
public class WeightControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer balanceNumber;
    private Double bagWeight;
    private String observations;

    public WeightControl(@NotNull String createdBy, Integer balanceNumber,
                         Double bagWeight, String observations) {
        super(createdBy);
        this.balanceNumber = balanceNumber;
        this.bagWeight = bagWeight;
        this.observations = observations;
    }
}
