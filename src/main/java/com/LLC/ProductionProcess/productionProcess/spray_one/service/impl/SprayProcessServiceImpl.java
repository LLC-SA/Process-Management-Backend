package com.LLC.ProductionProcess.productionProcess.spray_one.service.impl;

import com.LLC.ProductionProcess.productionProcess.spray_one.entity.SprayProcess;
import com.LLC.ProductionProcess.productionProcess.spray_one.payload.SprayProcessDto;
import com.LLC.ProductionProcess.productionProcess.spray_one.repository.SprayProcessRepository;
import com.LLC.ProductionProcess.productionProcess.spray_one.service.intf.SprayProcessService;
import com.LLC.ProductionProcess.utils.DtoMapper;

import java.util.List;

public class SprayProcessServiceImpl implements SprayProcessService {

    private SprayProcessRepository sprayProcessRepository;

    public SprayProcessServiceImpl(SprayProcessRepository sprayProcessRepository) {
        this.sprayProcessRepository = sprayProcessRepository;
    }

    @Override
    public SprayProcessDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<SprayProcessDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public SprayProcessDto createData(SprayProcessDto dto) {
        SprayProcess inputData = DtoMapper.dtoToEntity(dto, SprayProcess.class);
        SprayProcess savedDataInDB = sprayProcessRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, SprayProcessDto.class);
    }

    @Override
    public SprayProcessDto updateData(SprayProcessDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
