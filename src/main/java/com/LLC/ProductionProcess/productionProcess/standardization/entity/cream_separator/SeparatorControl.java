package com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator;

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
@Table(name = "desnatadora_control")
public class SeparatorControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "tipo_proceso")
    private String processType;

    @Column(name = "alimentación")
    private String feedOrigin;

    @Column(name = "volumen_alimentación")
    private Integer feedContainerLevel;

    @Column(name = "destino")
    private String productDestination;

    @Column(name = "volumen_destino")
    private String productDestinationContainerLevel;

    @OneToOne
    @JoinColumn(name = "cream_separator_process_id")
    SeparatorProcess separatorProcess;

    @OneToOne
    @JoinColumn(name = "cream_separator_feed_id")
    SeparatorFeed separatorFeed;

    @OneToOne
    @JoinColumn(name = "cream_separator_product_id")
    SeparatorProduct separatorProduct;

    @OneToOne
    @JoinColumn(name = "cream_separator_cream_id")
    SeparatorCream separatorCream;

    public SeparatorControl(LocalDate inputDate, LocalTime inputTime, String processType,
                            String feedOrigin, Integer feedContainerLevel, String productDestination,
                            String productDestinationContainerLevel) {
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.processType = processType;
        this.feedOrigin = feedOrigin;
        this.feedContainerLevel = feedContainerLevel;
        this.productDestination = productDestination;
        this.productDestinationContainerLevel = productDestinationContainerLevel;
    }
}
