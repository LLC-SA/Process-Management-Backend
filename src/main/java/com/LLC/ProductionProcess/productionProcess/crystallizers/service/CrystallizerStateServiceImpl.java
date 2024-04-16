package com.LLC.ProductionProcess.productionProcess.crystallizers.service;

import com.LLC.ProductionProcess.productionProcess.crystallizers.payload.CrystallizerStateDto;
import com.LLC.ProductionProcess.productionProcess.crystallizers.repository.CrystallizerStateRepository;

import java.util.List;

public class CrystallizerStateServiceImpl implements CrystallizerStateService {

    CrystallizerStateRepository crystallizerStateRepository;

    @Override
    public CrystallizerStateDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<CrystallizerStateDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public CrystallizerStateDto createData(CrystallizerStateDto dto) {
        return null;
    }

    @Override
    public CrystallizerStateDto updateData(CrystallizerStateDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
