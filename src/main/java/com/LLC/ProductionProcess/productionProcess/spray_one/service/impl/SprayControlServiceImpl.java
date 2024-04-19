package com.LLC.ProductionProcess.productionProcess.spray_one.service.impl;

import com.LLC.ProductionProcess.productionProcess.spray_one.entity.SprayControl;
import com.LLC.ProductionProcess.productionProcess.spray_one.payload.SprayControlDto;
import com.LLC.ProductionProcess.productionProcess.spray_one.repository.SprayControlRepository;
import com.LLC.ProductionProcess.productionProcess.spray_one.service.intf.SprayControlService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SprayControlServiceImpl implements SprayControlService {
    SprayControlRepository sprayControlRepository;

    public SprayControlServiceImpl(SprayControlRepository sprayControlRepository) {
        this.sprayControlRepository = sprayControlRepository;
    }

    @Override
    public SprayControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<SprayControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public SprayControlDto createData(SprayControlDto dto) {
        SprayControl inputData = DtoMapper.dtoToEntity(dto, SprayControl.class);
        SprayControl savedDataInDB = sprayControlRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, SprayControlDto.class);
    }

    @Override
    public SprayControlDto updateData(SprayControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
