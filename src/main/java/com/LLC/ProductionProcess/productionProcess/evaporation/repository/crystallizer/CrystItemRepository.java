package com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CrystItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrystItemRepository extends JpaRepository<CrystItem, Long> {

    List<CrystItem> findByEvapCrystallizerId(Long id);
}
