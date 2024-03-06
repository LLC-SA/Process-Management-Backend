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
@Table(name = "Evaporador_pasteurizador")
public class Pasteurizer extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String feedOrigin;
    private Double feedPh;
    private Double feedTemp;
    private Integer feedContainerLevel;
    private Double feedSolids;
    private Integer hotWaterTemp;
    private Integer pasteurizationTemp;
    private Integer flowRate;

    public Pasteurizer(@NotNull String createdBy, String feedOrigin, Double feedPh,
                       Double feedTemp, Integer feedContainerLevel, Double feedSolids,
                       Integer hotWaterTemp, Integer pasteurizationTemp, Integer flowRate) {
        super(createdBy);
        this.feedOrigin = feedOrigin;
        this.feedPh = feedPh;
        this.feedTemp = feedTemp;
        this.feedContainerLevel = feedContainerLevel;
        this.feedSolids = feedSolids;
        this.hotWaterTemp = hotWaterTemp;
        this.pasteurizationTemp = pasteurizationTemp;
        this.flowRate = flowRate;
    }
}
