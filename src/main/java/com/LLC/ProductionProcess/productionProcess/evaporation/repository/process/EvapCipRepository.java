package com.LLC.ProductionProcess.productionProcess.evaporation.repository.process;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.cip.EvapCip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvapCipRepository extends JpaRepository<EvapCip, Long> {
}




