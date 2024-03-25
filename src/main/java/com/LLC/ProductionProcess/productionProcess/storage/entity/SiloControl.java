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
@Table(name = "Silos_control")
public class SiloControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String siloNumber;
    private Integer containerVolume;
    // VER
    private String productType;
    private Double concentration;
    private Double temperature;
    private Double pH;
    private Integer acidity;

}
