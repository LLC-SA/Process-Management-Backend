package com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "desnatadora_alimentación")
public class SeparatorFeed extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // FEED //
    @Column(name = "alimentación_tipo")
    private String feedType;

    @Column(name = "concentración")
    private Integer feedConcentration;

    @Column(name = "temperatura")
    private Integer feedTemperature;

    @Column(name = "pH")
    private Double feedPh;

    public SeparatorFeed(String feedType, Integer feedConcentration, Integer feedTemperature, Double feedPh) {
        this.feedType = feedType;
        this.feedConcentration = feedConcentration;
        this.feedTemperature = feedTemperature;
        this.feedPh = feedPh;
    }
}
