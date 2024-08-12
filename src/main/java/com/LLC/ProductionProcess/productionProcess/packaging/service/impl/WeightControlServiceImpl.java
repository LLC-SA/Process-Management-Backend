package com.LLC.ProductionProcess.productionProcess.packaging.service.impl;

import com.LLC.ProductionProcess.productionProcess.packaging.entity.WeightControl;
import com.LLC.ProductionProcess.productionProcess.packaging.payload.WeightControlDto;
import com.LLC.ProductionProcess.productionProcess.packaging.repository.WeightControlRepository;
import com.LLC.ProductionProcess.productionProcess.packaging.service.intf.WeightControlService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightControlServiceImpl implements WeightControlService {
    private WeightControlRepository weightControlRepository;

    public WeightControlServiceImpl(WeightControlRepository weightControlRepository) {
        this.weightControlRepository = weightControlRepository;
    }

    @Override
    public WeightControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<WeightControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public WeightControlDto createData(WeightControlDto dto) {
        WeightControl inputData = DtoMapper.dtoToEntity(dto, WeightControl.class);
        WeightControl savedDataInDB = weightControlRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, WeightControlDto.class);
    }

    @Override
    public WeightControlDto updateData(WeightControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
