package com.LLC.ProductionProcess.productionProcess.standardization.entity.nanofiltration;

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
@Table(name = "nanofiltración_producto")
public class NanoProduct extends BaseDateEntity {
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

    public NanoProduct(Integer productType, String productConcentration, Integer productTemperature, Double productPh) {
        this.productType = productType;
        this.productConcentration = productConcentration;
        this.productTemperature = productTemperature;
        this.productPh = productPh;
    }
}
