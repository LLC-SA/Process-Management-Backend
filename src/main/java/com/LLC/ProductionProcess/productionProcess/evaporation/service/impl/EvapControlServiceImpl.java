package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.EvaporationControl;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.process.EvaporationControlDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.process.EvapControlRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvaporationControlService;
import com.LLC.ProductionProcess.utils.DtoMapper;

import java.time.LocalDate;
import java.util.List;

public class EvapControlServiceImpl implements EvaporationControlService {

    EvapControlRepository evapControlRepository;

    public EvapControlServiceImpl(EvapControlRepository evapControlRepository) {
        this.evapControlRepository = evapControlRepository;
    }

    @Override
    public EvaporationControlDto getDataById(Long id) {
        EvaporationControl evaporationControl = retrieveEvapControlById(id);

        return DtoMapper.entityToDto(evaporationControl, EvaporationControlDto.class);
    }

    @Override
    public List<EvaporationControlDto> getAllDataByDate(String date) {
        List<EvaporationControl> evapControlList = evapControlRepository.getAllEvapControlDataByDate(LocalDate.parse(date));

        return evapControlList.stream().map(data -> DtoMapper.entityToDto(data, EvaporationControlDto.class)).toList();
    }

    @Override
    public EvaporationControlDto createData(EvaporationControlDto evapDto) {
        EvaporationControl evapControlData = DtoMapper.dtoToEntity(evapDto, EvaporationControl.class);
        EvaporationControl evapControlResponse = evapControlRepository.save(evapControlData);
//
        return DtoMapper.dtoToEntity(evapControlResponse, EvaporationControlDto.class);
    }

    @Override
    public EvaporationControlDto updateData(EvaporationControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
        evapControlRepository.deleteById(id);
    }

    private EvaporationControl retrieveEvapControlById(Long id) {
        return evapControlRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Evaporator control data", "id", id));
    }
}
