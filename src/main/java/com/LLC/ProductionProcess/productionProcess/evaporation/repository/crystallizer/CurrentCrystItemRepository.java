package com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CurrentCrystItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurrentCrystItemRepository extends JpaRepository<CurrentCrystItem, Long> {

    List<CurrentCrystItem> findByCrystId(Long id);
}
