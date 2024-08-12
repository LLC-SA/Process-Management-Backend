package com.LLC.ProductionProcess.productionProcess.storage.entity;

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
@Table(name = "polvo_a_depósito")
public class PowderToStorage extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "batch_cristalizador")
    private Integer crystallizerBatch;

    @Column(name = "producto_tipo")
    private Integer productType;

    @Column(name = "disco")
    private String diskQuality;

    @Column(name = "aspecto_visual")
    private String visualAspectQuality;

    @Column(name = "humedad_polvo")
    private Double productHumidity;

    @Column(name = "pH")
    private Double productPh;

    @Column(name = "estabilidad_térmica")
    private String thermalStability;

    public PowderToStorage(Integer productType, String diskQuality, String visualAspectQuality,
                           Double productHumidity, Double productPh, String thermalStability) {
        this.productType = productType;
        this.diskQuality = diskQuality;
        this.visualAspectQuality = visualAspectQuality;
        this.productHumidity = productHumidity;
        this.productPh = productPh;
        this.thermalStability = thermalStability;
    }
}
