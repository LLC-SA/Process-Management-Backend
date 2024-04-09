package com.LLC.ProductionProcess.productionProcess.reception.standardization.entity.process;

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
@Table(name = "Nanofiltración_producto")
public class NanoProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer productFlow;
    private String productDestination;
    private String productDestinationContainerLevel;
    private String productConcentration;
    private Integer productTemperature;
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
