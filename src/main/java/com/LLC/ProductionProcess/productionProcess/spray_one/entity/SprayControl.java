package com.LLC.ProductionProcess.productionProcess.spray_one.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Spray_control")
public class SprayControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String processOrigin;
    private String processDescription;

    @OneToOne
    @JoinColumn(name = "crystallizer_id")
    CrytallizerState crytallizerState;

    @OneToOne
    @JoinColumn(name = "sprayOne_equipment_id")
    SprayProcess sprayProcess;

    @OneToOne
    @JoinColumn(name = "sprayOne_product_id")
    SprayProduct sprayProduct;

    public SprayControl(@NotNull String createdBy, String processOrigin, String processDescription) {
        super(createdBy);
        this.processOrigin = processOrigin;
        this.processDescription = processDescription;
    }
}
