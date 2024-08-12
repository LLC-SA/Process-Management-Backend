package com.LLC.ProductionProcess.productionProcess.cip_checks.service;

import com.LLC.ProductionProcess.productionProcess.cip_checks.entity.FilterCheck;
import com.LLC.ProductionProcess.productionProcess.cip_checks.payload.FilterCheckDto;
import com.LLC.ProductionProcess.productionProcess.cip_checks.repository.FilterCheckRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterCheckServiceImpl implements FilterCheckService {

    private FilterCheckRepository filterCheckRepository;

    public FilterCheckServiceImpl(FilterCheckRepository filterCheckRepository) {
        this.filterCheckRepository = filterCheckRepository;
    }

    @Override
    public FilterCheckDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<FilterCheckDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public FilterCheckDto createData(FilterCheckDto dto) {
        FilterCheck dataDB = DtoMapper.dtoToEntity(dto, FilterCheck.class);
        FilterCheck savedData = filterCheckRepository.save(dataDB);

        return DtoMapper.entityToDto(savedData, FilterCheckDto.class);
    }

    @Override
    public FilterCheckDto updateData(FilterCheckDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
