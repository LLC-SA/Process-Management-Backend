package com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "evaporador_llenado_cristalizador")
public class EvapCrystallizer extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate inputDate;

    @Column(name = "batch")
    private Integer batchNumber;

    @Column(name = "cristalizador_número")
    private String crystallizerNumber;

    @Column(name = "revisado_desinfectado")
    private String checkedOrDisinfected;

    @Column(name = "tipo_producto")
    private String productType;

    @Column(name = "lotes_d90")
    private String d90BatchId;

    @Column(name = "origen")
    private String crystallizerOrigin;

    @Column(name = "pH")
    private Double concentratepH;

    @Column(name = "acidez")
    private Integer acidity;

    @Column(name = "volumen")
    private Integer crystallizerVolume;

    @OneToMany(mappedBy = "evapCrystallizer", cascade = CascadeType.ALL)
    private List<EvapCrystallizerItem> evapCrystallizerItems;

    public EvapCrystallizer(@NotNull String createdBy, LocalDate inputDate, Integer batchNumber,
                            String crystallizerNumber, String checkedOrDisinfected,
                            String productType, String d90BatchId, String crystallizerOrigin,
                            Double concentratepH, Integer acidity, Integer crystallizerVolume) {
        super(createdBy);
        this.inputDate = inputDate;
        this.batchNumber = batchNumber;
        this.crystallizerNumber = crystallizerNumber;
        this.checkedOrDisinfected = checkedOrDisinfected;
        this.productType = productType;
        this.d90BatchId = d90BatchId;
        this.crystallizerOrigin = crystallizerOrigin;
        this.concentratepH = concentratepH;
        this.acidity = acidity;
        this.crystallizerVolume = crystallizerVolume;
    }
}
