package com.LLC.ProductionProcess.productionProcess.packaging.entity;

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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "envase_uno_PCC")
public class PCCControl extends BaseDateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha_ingreso")
    private LocalDate inputDate;

    @Column(name = "hora_realización")
    private LocalTime inputTime;

    @Column(name = "envasadora_tipo")
    private String packingType;

    // PPRO
    @Column(name = "integridad_zaranda")
    private Boolean vibratingSifterIntegrity;

    @Column(name = "control_de_iman")
    private Boolean magnetControl;

    //PCC
    @Column(name = "control_fe")
    private Boolean feControl;

    @Column(name = "control_noFe")
    private Boolean noFeControl;

    @Column(name = "control_inoxidable")
    private Boolean inoxControl;

    @Column(name = "observación")
    private String observations;

    public PCCControl(@NotNull String createdBy, LocalDate inputDate, LocalTime inputTime,
                      String packingType, Boolean vibratingSifterIntegrity, Boolean magnetControl,
                      Boolean feControl, Boolean noFeControl, Boolean inoxControl, String observations) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.packingType = packingType;
        this.vibratingSifterIntegrity = vibratingSifterIntegrity;
        this.magnetControl = magnetControl;
        this.feControl = feControl;
        this.noFeControl = noFeControl;
        this.inoxControl = inoxControl;
        this.observations = observations;
    }
}
