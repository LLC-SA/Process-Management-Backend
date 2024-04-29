package com.LLC.ProductionProcess.productionProcess.evaporation.entity.process;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "evaporador_pasteurizador")
public class Pasteurizer extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "temperatura_agua_caliente")
    private Integer hotWaterTemp;

    @Column(name = "temperatura_pasteurización")
    private Integer pasteurizationTemp;

    @Column(name = "caudal")
    private Integer flowRate;

    public Pasteurizer(@NotNull String createdBy, Integer hotWaterTemp, Integer pasteurizationTemp, Integer flowRate) {
        super(createdBy);
        this.hotWaterTemp = hotWaterTemp;
        this.pasteurizationTemp = pasteurizationTemp;
        this.flowRate = flowRate;
    }
}
