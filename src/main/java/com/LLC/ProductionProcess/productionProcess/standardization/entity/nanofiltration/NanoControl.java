package com.LLC.ProductionProcess.productionProcess.standardization.entity.nanofiltration;

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
@Table(name = "nanofiltración_control")
public class NanoControl extends BaseDateEntity {

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
    @JoinColumn(name = "nano_feed_id")
    NanoFeed nanoFeed;

    @OneToOne
    @JoinColumn(name = "nano_process_id")
    NanoProcess nanoProcess;

    @OneToOne
    @JoinColumn(name = "nano_product_id")
    NanoProduct nanoProduct;

    public NanoControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                       String feedOrigin, Integer feedContainerLevel, String processType,
                       String productDestination, String productDestinationContainerLevel) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.feedOrigin = feedOrigin;
        this.feedContainerLevel = feedContainerLevel;
        this.processType = processType;
        this.productDestination = productDestination;
        this.productDestinationContainerLevel = productDestinationContainerLevel;
    }
}


