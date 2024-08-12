package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator.SeparatorControl;
import com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator.SeparatorControlDto;
import com.LLC.ProductionProcess.productionProcess.standardization.repository.cream_separator.SeparatorControlRepository;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.SeparatorControlService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeparatorControlServiceImpl implements SeparatorControlService {

    private SeparatorControlRepository separatorControlRepository;

    public SeparatorControlServiceImpl(SeparatorControlRepository separatorControlRepository) {
        this.separatorControlRepository = separatorControlRepository;
    }

    @Override

    public SeparatorControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<SeparatorControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public SeparatorControlDto createData(SeparatorControlDto dto) {
        SeparatorControl inputData = DtoMapper.dtoToEntity(dto, SeparatorControl.class);
        SeparatorControl savedDataInDB = separatorControlRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, SeparatorControlDto.class);
    }

    @Override
    public SeparatorControlDto updateData(SeparatorControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
