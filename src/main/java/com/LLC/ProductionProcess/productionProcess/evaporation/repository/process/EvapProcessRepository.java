package com.LLC.ProductionProcess.productionProcess.evaporation.repository.process;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.EvapProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EvapProcessRepository extends JpaRepository<EvapProcess, Long> {
    @Query(value = " SELECT * FROM evaporador_proceso u WHERE u.created_date = ?1 ", nativeQuery = true)
    List<EvapProcess> findAllByCreatedDate(LocalDate date);
}



