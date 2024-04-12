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

    @Column(name = "alimentación")
    private String feedOrigin;

    @Column(name = "pH")
    private Double feedPh;

    @Column(name = "temperatura_alimentación")
    private Double feedTemp;

    @Column(name = "volumen_alimentación")
    private Integer feedContainerLevel;

    @Column(name = "concentración_alimentación")
    private Double feedSolids;

    @Column(name = "temperatura_agua_caliente")
    private Integer hotWaterTemp;

    @Column(name = "temperatura_pasteurización")
    private Integer pasteurizationTemp;

    @Column(name = "caudal")
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
