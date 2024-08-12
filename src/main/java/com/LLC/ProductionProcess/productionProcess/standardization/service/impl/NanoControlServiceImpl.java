package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.entity.nanofiltration.NanoControl;
import com.LLC.ProductionProcess.productionProcess.standardization.payload.nanofiltration.NanoControlDto;
import com.LLC.ProductionProcess.productionProcess.standardization.repository.nanofiltration.NanoControlRepository;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.NanoControlService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NanoControlServiceImpl implements NanoControlService {
    
    private NanoControlRepository nanoControlRepository;

    public NanoControlServiceImpl(NanoControlRepository nanoControlRepository) {
        this.nanoControlRepository = nanoControlRepository;
    }

    @Override
    public NanoControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<NanoControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public NanoControlDto createData(NanoControlDto dto) {
        NanoControl inputData = DtoMapper.dtoToEntity(dto, NanoControl.class);
        NanoControl savedDataInDB = nanoControlRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, NanoControlDto.class);
    }

    @Override
    public NanoControlDto updateData(NanoControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
