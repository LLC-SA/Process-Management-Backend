package com.LLC.ProductionProcess.productionProcess.standardization.entity.process;

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
@Table(name = "nanofiltración_producto")
public class NanoProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "caudal")
    private Integer productFlow;

    @Column(name = "destino")
    private String productDestination;

    @Column(name = "volumen_destino")
    private String productDestinationContainerLevel;

    @Column(name = "concentración")
    private String productConcentration;

    @Column(name = "temperatura")
    private Integer productTemperature;

    @Column(name = "pH")
    private Double productPh;

    public NanoProduct(Integer productFlow, String productDestination, String productDestinationContainerLevel,
                       String productConcentration, Integer productTemperature, Double productPh) {
        this.productFlow = productFlow;
        this.productDestination = productDestination;
        this.productDestinationContainerLevel = productDestinationContainerLevel;
        this.productConcentration = productConcentration;
        this.productTemperature = productTemperature;
        this.productPh = productPh;
    }
}
