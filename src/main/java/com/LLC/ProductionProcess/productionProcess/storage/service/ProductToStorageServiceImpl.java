package com.LLC.ProductionProcess.productionProcess.storage.service;

import com.LLC.ProductionProcess.productionProcess.storage.entity.ProductToStorage;
import com.LLC.ProductionProcess.productionProcess.storage.payload.ProductToStorageDto;
import com.LLC.ProductionProcess.productionProcess.storage.repository.ProductToStorageRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductToStorageServiceImpl implements ProductToStorageService {

    private ProductToStorageRepository productToStorageRepository;

    public ProductToStorageServiceImpl(ProductToStorageRepository productToStorageRepository) {
        this.productToStorageRepository = productToStorageRepository;
    }

    @Override
    public ProductToStorageDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<ProductToStorageDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public ProductToStorageDto createData(ProductToStorageDto dto) {
        ProductToStorage inputData = DtoMapper.dtoToEntity(dto, ProductToStorage.class);
        ProductToStorage savedDataInDB = productToStorageRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, ProductToStorageDto.class);
    }

    @Override
    public ProductToStorageDto updateData(ProductToStorageDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
