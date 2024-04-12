package com.LLC.ProductionProcess.productionProcess.standardization.entity.process.cream_separator;

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
@Table(name = "desnatadora_crema")
public class CreamSeparatorProduct extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "hora")
    private LocalTime inputTime;

    @Column(name = "bins_número")
    private Integer binsNumber;

    @Column(name = "bins_volumen")
    private Integer binsQuantity;

    public CreamSeparatorProduct(@NotNull String createdBy, LocalDate inputDate,
                                 LocalTime inputTime, Integer binsNumber, Integer binsQuantity) {
        super(createdBy);
        this.inputDate = inputDate;
        this.inputTime = inputTime;
        this.binsNumber = binsNumber;
        this.binsQuantity = binsQuantity;
    }
}
