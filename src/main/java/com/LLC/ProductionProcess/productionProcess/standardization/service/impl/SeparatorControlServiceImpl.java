package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.payload.cream_separator.SeparatorControlDto;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.SeparatorControlService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeparatorControlServiceImpl implements SeparatorControlService {
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
        return null;
    }

    @Override
    public SeparatorControlDto updateData(SeparatorControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
