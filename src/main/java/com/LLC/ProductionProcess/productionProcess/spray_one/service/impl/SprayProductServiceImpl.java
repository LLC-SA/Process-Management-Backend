package com.LLC.ProductionProcess.productionProcess.spray_one.service.impl;

import com.LLC.ProductionProcess.productionProcess.spray_one.entity.SprayProduct;
import com.LLC.ProductionProcess.productionProcess.spray_one.payload.SprayProductDto;
import com.LLC.ProductionProcess.productionProcess.spray_one.repository.SprayProductRepository;
import com.LLC.ProductionProcess.productionProcess.spray_one.service.intf.SprayProductService;
import com.LLC.ProductionProcess.utils.DtoMapper;

import java.util.List;

public class SprayProductServiceImpl implements SprayProductService {
    SprayProductRepository sprayProductRepository;

    public SprayProductServiceImpl(SprayProductRepository sprayProductRepository) {
        this.sprayProductRepository = sprayProductRepository;
    }

    @Override
    public SprayProductDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<SprayProductDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public SprayProductDto createData(SprayProductDto dto) {
        SprayProduct inputData = DtoMapper.dtoToEntity(dto, SprayProduct.class);
        SprayProduct savedDataInDB = sprayProductRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, SprayProductDto.class);
    }

    @Override
    public SprayProductDto updateData(SprayProductDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
