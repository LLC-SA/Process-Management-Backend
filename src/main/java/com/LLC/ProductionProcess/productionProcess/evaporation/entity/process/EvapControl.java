package com.LLC.ProductionProcess.productionProcess.evaporation.entity.process;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
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

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "origen_proceso")
    private String processOrigin;

    @Column(name = "descripción_proceso")
    private String processDescription;

    @Column(name = "destino_proceso")
    private String processDestination;

    @Column(name = "caudal")
    private Integer flowValue;

    @OneToOne
    @JoinColumn(name = "evap_pasteurizer_id")
    Pasteurizer pasteurizer;

    @OneToOne
    @JoinColumn(name = "evap_evaporator_id")
    EvapProcess evapProcess;

    public EvapControl(@NotNull String createdBy, String processOrigin,
                       String processDescription, String processDestination,
                       Integer flowValue) {
        super(createdBy);
        this.processOrigin = processOrigin;
        this.processDescription = processDescription;
        this.processDestination = processDestination;
        this.flowValue = flowValue;
    }
}
