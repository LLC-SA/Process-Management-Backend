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
@Table(name = "Evaporador_control")
public class EvaporationControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime inputTime;
    private LocalDate inputDate;
    private String processOrigin;
    private String processDescription;
    private String processDestination;
    private Integer flowValue;

    @OneToOne
    @JoinColumn(name = "evap_pasteurizer_id")
    Pasteurizer pasteurizer;

    @OneToOne
    @JoinColumn(name = "evap_evaporator_id")
    EvaporatorProcess evaporatorProcess;

    public EvaporationControl(@NotNull String createdBy, String processOrigin,
                              String processDescription, String processDestination,
                              Integer flowValue) {
        super(createdBy);
        this.processOrigin = processOrigin;
        this.processDescription = processDescription;
        this.processDestination = processDestination;
        this.flowValue = flowValue;
    }
}
