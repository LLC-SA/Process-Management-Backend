package com.LLC.ProductionProcess.productionProcess.packing.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Envase_control_PCC")
public class PPCControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String packingType;
    // PPRO
    private Boolean vibratingSifterIntegrity;
    private Boolean magnetControl;
    //PCC
    private Boolean feControl;
    private Boolean noFeControl;
    private Boolean inoxControl;
    private String observations;

    public PPCControl(@NotNull String createdBy, String packingType,
                      Boolean vibratingSifterIntegrity, Boolean magnetControl,
                      Boolean feControl, Boolean noFeControl,
                      Boolean inoxControl, String observations) {
        super(createdBy);
        this.packingType = packingType;
        this.vibratingSifterIntegrity = vibratingSifterIntegrity;
        this.magnetControl = magnetControl;
        this.feControl = feControl;
        this.noFeControl = noFeControl;
        this.inoxControl = inoxControl;
        this.observations = observations;
    }
}
