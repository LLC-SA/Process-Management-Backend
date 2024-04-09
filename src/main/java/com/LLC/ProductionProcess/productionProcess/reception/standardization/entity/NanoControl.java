package com.LLC.ProductionProcess.productionProcess.reception.standardization.entity;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import com.LLC.ProductionProcess.productionProcess.reception.standardization.entity.process.NanoProcess;
import com.LLC.ProductionProcess.productionProcess.reception.standardization.entity.process.NanoProduct;
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
@Table(name = "Nanofiltración_control")
public class NanoControl extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime inputTime;
    private LocalDate inputDate;
    private String processType;
    private String processDescription;

    @OneToOne
    @JoinColumn(name = "nano_process_id")
    NanoProcess nanoProcess;

    @OneToOne
    @JoinColumn(name = "nano_product_id")
    NanoProduct nanoProduct;

    public NanoControl(@NotNull String createdBy, LocalTime inputTime,
                       LocalDate inputDate, String processType,
                       String processDescription) {
        super(createdBy);
        this.inputTime = inputTime;
        this.inputDate = inputDate;
        this.processType = processType;
        this.processDescription = processDescription;
    }
}


