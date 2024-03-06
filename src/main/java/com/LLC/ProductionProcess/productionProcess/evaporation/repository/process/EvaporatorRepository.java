package com.LLC.ProductionProcess.productionProcess.evaporation.repository.process;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.EvaporatorProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EvaporatorRepository extends JpaRepository<EvaporatorProcess, Long> {

    @Query(value = " SELECT * FROM evaporador_proceso u WHERE u.created_date = ?1 ", nativeQuery = true)
    List<EvaporatorProcess> findAllByCreatedDate(LocalDate date);
}



