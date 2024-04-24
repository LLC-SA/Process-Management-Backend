package com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "desnatadora_producto")
public class SeparatorProduct extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "producto_tipo")
    private Integer productType;

    @Column(name = "producto_concentración")
    private String productConcentration;

    @Column(name = "producto_temperatura")
    private Integer productTemperature;

    @Column(name = "producto_pH")
    private Double productPh;

    public SeparatorProduct(Integer productType, String productConcentration, Integer productTemperature, Double productPh) {
        this.productType = productType;
        this.productConcentration = productConcentration;
        this.productTemperature = productTemperature;
        this.productPh = productPh;
    }
}
