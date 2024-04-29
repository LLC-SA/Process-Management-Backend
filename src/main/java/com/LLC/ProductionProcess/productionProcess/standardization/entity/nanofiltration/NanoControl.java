package com.LLC.ProductionProcess.productionProcess.standardization.entity.nanofiltration;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import com.LLC.ProductionProcess.productionProcess.storage.entity.FeedControl;
import com.LLC.ProductionProcess.productionProcess.storage.entity.ProductToStorage;
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
@Table(name = "nano_control")
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

    @Column(name = "alimentación_proceso")
    private String feedOrigin;

    @Column(name = "destino_proceso")
    private String productDestination;

    @OneToOne
    @JoinColumn(name = "nano_feed_id")
    FeedControl feedControl;

    @OneToOne
    @JoinColumn(name = "nano_process_id")
    NanoProcess nanoProcess;

    @OneToOne
    @JoinColumn(name = "nano_product_id")
    ProductToStorage productToStorage;

    public NanoControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                       String feedOrigin, String processType, String productDestination) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.feedOrigin = feedOrigin;
        this.processType = processType;
        this.productDestination = productDestination;

    }
}


