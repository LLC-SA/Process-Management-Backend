package com.LLC.ProductionProcess.productionProcess.crystallizers.service;

import com.LLC.ProductionProcess.productionProcess.crystallizers.entity.CrystallizerState;
import com.LLC.ProductionProcess.productionProcess.crystallizers.payload.CrystallizerStateDto;
import com.LLC.ProductionProcess.productionProcess.crystallizers.repository.CrystallizerStateRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrystallizerStateServiceImpl implements CrystallizerStateService {

    private CrystallizerStateRepository crystallizerStateRepository;

    public CrystallizerStateServiceImpl(CrystallizerStateRepository crystallizerStateRepository) {
        this.crystallizerStateRepository = crystallizerStateRepository;
    }

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
        CrystallizerState crystallizerStateData = DtoMapper.dtoToEntity(dto, CrystallizerState.class);
        CrystallizerState crystallizerStateResponse = crystallizerStateRepository.save(crystallizerStateData);

        return DtoMapper.dtoToEntity(crystallizerStateResponse, CrystallizerStateDto.class);
    }

    @Override
    public CrystallizerStateDto updateData(CrystallizerStateDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
    }
}
