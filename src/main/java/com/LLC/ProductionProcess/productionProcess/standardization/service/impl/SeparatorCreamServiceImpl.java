package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator.SeparatorCream;
import com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator.SeparatorCreamDto;
import com.LLC.ProductionProcess.productionProcess.standardization.repository.cream_separator.SeparatorCreamRepository;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.SeparatorCreamService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeparatorCreamServiceImpl implements SeparatorCreamService {

    private SeparatorCreamRepository separatorCreamRepository;

    public SeparatorCreamServiceImpl(SeparatorCreamRepository separatorCreamRepository) {
        this.separatorCreamRepository = separatorCreamRepository;
    }

    @Override
    public SeparatorCreamDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<SeparatorCreamDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public SeparatorCreamDto createData(SeparatorCreamDto dto) {
        SeparatorCream inputData = DtoMapper.dtoToEntity(dto, SeparatorCream.class);
        SeparatorCream savedDataInDB = separatorCreamRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, SeparatorCreamDto.class);
    }

    @Override
    public SeparatorCreamDto updateData(SeparatorCreamDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
