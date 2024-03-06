package com.LLC.ProductionProcess.productionProcess.evaporation.repository.process;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.CoolingTower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoolingTowerRepository extends JpaRepository<CoolingTower, Long> {
}
