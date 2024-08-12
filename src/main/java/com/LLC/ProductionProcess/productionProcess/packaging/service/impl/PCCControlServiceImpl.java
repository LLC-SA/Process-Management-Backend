package com.LLC.ProductionProcess.productionProcess.packaging.service.impl;

import com.LLC.ProductionProcess.productionProcess.packaging.entity.PCCControl;
import com.LLC.ProductionProcess.productionProcess.packaging.payload.PCCControlDto;
import com.LLC.ProductionProcess.productionProcess.packaging.repository.PCCControlRepository;
import com.LLC.ProductionProcess.productionProcess.packaging.service.intf.PCCControlService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PCCControlServiceImpl implements PCCControlService {

    private PCCControlRepository pccControlRepository;

    public PCCControlServiceImpl(PCCControlRepository pccControlRepository) {
        this.pccControlRepository = pccControlRepository;
    }

    @Override
    public PCCControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<PCCControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public PCCControlDto createData(PCCControlDto dto) {
        PCCControl inputData = DtoMapper.dtoToEntity(dto, PCCControl.class);
        PCCControl savedDataInDB = pccControlRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, PCCControlDto.class);
    }

    @Override
    public PCCControlDto updateData(PCCControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
