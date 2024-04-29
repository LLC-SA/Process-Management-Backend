package com.LLC.ProductionProcess.productionProcess.evaporation.entity.process;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import com.LLC.ProductionProcess.productionProcess.storage.entity.FeedControl;
import com.LLC.ProductionProcess.productionProcess.storage.entity.ProductToStorage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "evaporador_control")
public class EvapControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_ingreso")
    private LocalDate inputDate;

    @Column(name = "hora_realización")
    private LocalTime inputTime;

    @Column(name = "proceso_tipo")
    private String processType;

    @Column(name = "origen_alimentación")
    private String feedOrigin;

    @Column(name = "destino_producto")
    private String productDestination;

    @OneToOne
    @JoinColumn(name = "fk_evap_feed_id")
    FeedControl feedControl;

    @OneToOne
    @JoinColumn(name = "fk_evap_pasteurizer_id")
    Pasteurizer pasteurizer;

    @OneToOne
    @JoinColumn(name = "fk_evap_process_id")
    EvapProcess evapProcess;

    @OneToOne
    @JoinColumn(name = "fk_evap_product_id")
    ProductToStorage productToStorage;

    public EvapControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                       String processType, String feedOrigin, String productDestination) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.processType = processType;
        this.feedOrigin = feedOrigin;
        this.productDestination = productDestination;
    }
}
