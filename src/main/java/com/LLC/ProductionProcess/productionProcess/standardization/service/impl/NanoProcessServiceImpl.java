package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.payload.nanofiltration.NanoProcessDto;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.NanoProcessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NanoProcessServiceImpl implements NanoProcessService {
    @Override
    public NanoProcessDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<NanoProcessDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public NanoProcessDto createData(NanoProcessDto dto) {
        return null;
    }

    @Override
    public NanoProcessDto updateData(NanoProcessDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
