package com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CrystallizerItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CrystallizerItemRepository extends JpaRepository<CrystallizerItem, Long> {

    List<CrystallizerItem> findByCrystallizerId(Long crystallizerId);
}
