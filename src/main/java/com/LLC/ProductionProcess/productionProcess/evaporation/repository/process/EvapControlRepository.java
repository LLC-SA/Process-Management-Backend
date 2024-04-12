package com.LLC.ProductionProcess.productionProcess.evaporation.repository.process;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.EvapControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EvapControlRepository extends JpaRepository<EvapControl, Long> {

    @Query(value = " SELECT * FROM evaporador_control c WHERE c.created_date = ?1 ", nativeQuery = true)
    List<EvapControl> getAllEvapControlDataByDate(LocalDate date);
}
