package com.LLC.ProductionProcess.productionProcess.spray_one.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "spray_uno_producto")
public class SprayProduct extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_producto")
    private Integer productGenerated;

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

    public SprayProduct(@NotNull String createdBy, Integer productGenerated,
                        String diskQuality, String visualAspectQuality,
                        Double productHumidity, Double productPh, String thermalStability) {
        super(createdBy);
        this.productGenerated = productGenerated;
        this.diskQuality = diskQuality;
        this.visualAspectQuality = visualAspectQuality;
        this.productHumidity = productHumidity;
        this.productPh = productPh;
        this.thermalStability = thermalStability;
    }
}
