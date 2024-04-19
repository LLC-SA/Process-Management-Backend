package com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "desnatadora_control")
public class CreamSeparatorControl {
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
    @JoinColumn(name = "cream_separator_process_id")
    CreamSeparatorProcess creamSeparatorProcess;

    @OneToOne
    @JoinColumn(name = "cream_separator_product_id")
    CreamSeparatorCream creamSeparatorCream;
}
