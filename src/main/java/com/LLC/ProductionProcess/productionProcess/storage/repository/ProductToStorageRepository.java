package com.LLC.ProductionProcess.productionProcess.storage.repository;

import com.LLC.ProductionProcess.productionProcess.storage.entity.ProductToStorage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductToStorageRepository extends JpaRepository<ProductToStorage, Long> {
}
