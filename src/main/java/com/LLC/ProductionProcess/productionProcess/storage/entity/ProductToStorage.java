package com.LLC.ProductionProcess.productionProcess.storage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producto_a_almacenamiento")
public class ProductToStorage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "tipo")
    private Integer productType;

    @Column(name = "concentración")
    private String productConcentration;

    @Column(name = "temperatura")
    private Integer productTemperature;

    @Column(name = "pH")
    private Double productPh;

    @Column(name = "equipo_generador")
    private String generatedBy;

    public ProductToStorage(LocalDate inputDate, LocalTime inputTime, Integer productType, String productConcentration,
                            Integer productTemperature, Double productPh, String generatedBy) {
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.productType = productType;
        this.productConcentration = productConcentration;
        this.productTemperature = productTemperature;
        this.productPh = productPh;
        this.generatedBy = generatedBy;
    }
}
