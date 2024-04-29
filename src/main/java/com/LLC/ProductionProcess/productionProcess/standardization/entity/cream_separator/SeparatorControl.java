package com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import com.LLC.ProductionProcess.productionProcess.storage.entity.FeedControl;
import com.LLC.ProductionProcess.productionProcess.storage.entity.ProductToStorage;
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

    @Column(name = "alimentación_proceso")
    private String feedOrigin;

    @Column(name = "destino_proceso")
    private String productDestination;

    @OneToOne
    @JoinColumn(name = "cream_separator_process_id")
    SeparatorProcess separatorProcess;

    @OneToOne
    @JoinColumn(name = "cream_separator_feed_id")
    FeedControl feedControl;

    @OneToOne
    @JoinColumn(name = "cream_separator_product_id")
    ProductToStorage productToStorage;

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
        this.productDestination = productDestination;
    }
}
