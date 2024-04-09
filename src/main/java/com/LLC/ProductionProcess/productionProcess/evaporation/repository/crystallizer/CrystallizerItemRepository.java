package com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrystallizerItemRepository extends JpaRepository<EvapCrystallizerItem, Long> {

    List<EvapCrystallizerItem> findByCrystallizerId(Long crystallizerId);
}
