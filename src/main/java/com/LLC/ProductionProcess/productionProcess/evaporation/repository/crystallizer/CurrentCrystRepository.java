package com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CurrentCryst;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CurrentCrystRepository extends JpaRepository<CurrentCryst, Long> {
    @Query(value = " SELECT * FROM cristalizadores_estado c WHERE c.created_date = ?1 ", nativeQuery = true)
    List<CurrentCryst> findAllByCreatedDate(LocalDate date);

}
