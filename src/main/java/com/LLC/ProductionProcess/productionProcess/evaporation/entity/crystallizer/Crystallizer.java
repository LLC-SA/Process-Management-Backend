package com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer;

import com.LLC.ProductionProcess.generics.entity.BaseDateEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Cristalizadores_estado")
public class Crystallizer extends BaseDateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer batchNumber;
    private String crystallizerNumber;
    private String checkedOrDisinfected;
    private String productType;
    private String d90BatchId;
    private String crystallizerOrigin;
    private Double concentratepH;
    private Integer acidity;
    private Integer crystallizerVolume;

    @OneToMany(mappedBy = "crystallizer", cascade = CascadeType.ALL)
    private List<CrystallizerItem> crystallizerItems;

    public Crystallizer(@NotNull String createdBy, Integer batchNumber,
                        String crystallizerNumber, String checkedOrDisinfected,
                        String productType, String d90BatchId,
                        String crystallizerOrigin, Double concentratepH,
                        Integer acidity, Integer crystallizerVolume) {
        super(createdBy);
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
