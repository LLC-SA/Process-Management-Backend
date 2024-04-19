package com.LLC.ProductionProcess.productionProcess.standardization.entity.nanofiltration;

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
@Table(name = "nanofiltración_alimentación")
public class NanoFeed {
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

    @Column(name = "turbidez")
    private Integer feedTurbidity;

    public NanoFeed(String feedType, Integer feedConcentration, Integer feedTemperature,
                    Double feedPh, Integer feedTurbidity) {
        this.feedType = feedType;
        this.feedConcentration = feedConcentration;
        this.feedTemperature = feedTemperature;
        this.feedPh = feedPh;
        this.feedTurbidity = feedTurbidity;
    }
}
