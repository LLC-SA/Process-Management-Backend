package com.LLC.ProductionProcess.productionProcess.standardization.entity.cip;

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
@Table(name = "CIP_nanofiltración")
public class NanoCip extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cipType;
    private Integer cipTemperature;
    private Integer cipTime;
    private Double cipPh;
    private Integer cipPressure;

    public NanoCip(@NotNull String createdBy, String cipType, Integer cipTemperature,
                   Integer cipTime, Double cipPh, Integer cipPressure) {
        super(createdBy);
        this.cipType = cipType;
        this.cipTemperature = cipTemperature;
        this.cipTime = cipTime;
        this.cipPh = cipPh;
        this.cipPressure = cipPressure;
    }
}
