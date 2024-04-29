package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator.SeparatorCreamDto;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.SeparatorCreamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeparatorCreamServiceImpl implements SeparatorCreamService {
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
        return null;
    }

    @Override
    public SeparatorCreamDto updateData(SeparatorCreamDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
