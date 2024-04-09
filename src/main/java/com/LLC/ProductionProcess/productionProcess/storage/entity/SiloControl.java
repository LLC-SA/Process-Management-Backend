package com.LLC.ProductionProcess.productionProcess.storage.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "silos_control")
public class SiloControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate inputDate;
    private LocalTime inputTime;

    private String siloNumber;
    private Integer containerVolume;
    private String productType;
    private Double concentration;
    private Double temperature;
    private Double pH;
    private Integer acidity;

}
