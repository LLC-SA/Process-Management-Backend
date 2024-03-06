package com.LLC.ProductionProcess.productionProcess.standardization.entity.process.cream_separator;

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
@Table(name = "Desnatadora_crema")
public class CreamSeparatorProduct extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer binsNumber;
    private Integer binsQuantity;

    public CreamSeparatorProduct(@NotNull String createdBy, Integer binsNumber, Integer binsQuantity) {
        super(createdBy);
        this.binsNumber = binsNumber;
        this.binsQuantity = binsQuantity;
    }
}
