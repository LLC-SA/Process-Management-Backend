package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator.SeparatorProcess;
import com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator.SeparatorProcessDto;
import com.LLC.ProductionProcess.productionProcess.standardization.repository.cream_separator.SeparatorProcessRepository;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.SeparatorProcessService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeparatorProcessServiceImpl implements SeparatorProcessService {

    private SeparatorProcessRepository separatorProcessRepository;

    public SeparatorProcessServiceImpl(SeparatorProcessRepository separatorProcessRepository) {
        this.separatorProcessRepository = separatorProcessRepository;
    }

    @Override
    public SeparatorProcessDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<SeparatorProcessDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public SeparatorProcessDto createData(SeparatorProcessDto dto) {
        SeparatorProcess inputData = DtoMapper.dtoToEntity(dto, SeparatorProcess.class);
        SeparatorProcess savedDataInDB = separatorProcessRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, SeparatorProcessDto.class);
    }

    @Override
    public SeparatorProcessDto updateData(SeparatorProcessDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
