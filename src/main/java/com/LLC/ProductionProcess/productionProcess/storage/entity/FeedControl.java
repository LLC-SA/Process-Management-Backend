package com.LLC.ProductionProcess.productionProcess.storage.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "silos")
public class FeedControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "silo_número")
    private String siloNumber;

    @Column(name = "tipo")
    private String feedType;

    @Column(name = "volumen")
    private Integer feedContainerVolume;

    @Column(name = "concentración")
    private Double feedConcentration;

    @Column(name = "temperatura")
    private Double feedTemperature;

    @Column(name = "pH")
    private Double feedPh;

    @Column(name = "acidez")
    private Integer feedAcidity;

    @Column(name = "equipo_proceso")
    private String usedBy;

    public FeedControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                       String siloNumber, String feedType, Integer feedContainerVolume,
                       Double feedConcentration, Double feedTemperature, Double feedPh,
                       Integer feedAcidity, String usedBy) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.siloNumber = siloNumber;
        this.feedType = feedType;
        this.feedContainerVolume = feedContainerVolume;
        this.feedConcentration = feedConcentration;
        this.feedTemperature = feedTemperature;
        this.feedPh = feedPh;
        this.feedAcidity = feedAcidity;
        this.usedBy = usedBy;
    }
}
