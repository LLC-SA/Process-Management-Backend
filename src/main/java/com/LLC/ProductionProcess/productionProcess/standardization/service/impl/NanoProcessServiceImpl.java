package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.entity.nanofiltration.NanoProcess;
import com.LLC.ProductionProcess.productionProcess.standardization.payload.nanofiltration.NanoProcessDto;
import com.LLC.ProductionProcess.productionProcess.standardization.repository.nanofiltration.NanoProcessRepository;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.NanoProcessService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NanoProcessServiceImpl implements NanoProcessService {
    
    private NanoProcessRepository nanoProcessRepository;

    public NanoProcessServiceImpl(NanoProcessRepository nanoProcessRepository) {
        this.nanoProcessRepository = nanoProcessRepository;
    }

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
        NanoProcess inputData = DtoMapper.dtoToEntity(dto, NanoProcess.class);
        NanoProcess savedDataInDB = nanoProcessRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, NanoProcessDto.class);
    }

    @Override
    public NanoProcessDto updateData(NanoProcessDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
