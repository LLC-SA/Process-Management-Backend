package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.EvapControl;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.process.EvapControlDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.process.EvapControlRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvapControlService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EvapControlServiceImpl implements EvapControlService {

    EvapControlRepository evapControlRepository;

    public EvapControlServiceImpl(EvapControlRepository evapControlRepository) {
        this.evapControlRepository = evapControlRepository;
    }

    @Override
    public EvapControlDto getDataById(Long id) {
        EvapControl evapControl = retrieveEvapControlById(id);

        return DtoMapper.entityToDto(evapControl, EvapControlDto.class);
    }

    @Override
    public List<EvapControlDto> getAllDataByDate(String date) {
        List<EvapControl> evapControlList = evapControlRepository.getAllEvapControlDataByDate(LocalDate.parse(date));

        return evapControlList.stream().map(data -> DtoMapper.entityToDto(data, EvapControlDto.class)).toList();
    }

    @Override
    public EvapControlDto createData(EvapControlDto evapDto) {
        EvapControl evapControlData = DtoMapper.dtoToEntity(evapDto, EvapControl.class);
        EvapControl evapControlResponse = evapControlRepository.save(evapControlData);

        return DtoMapper.dtoToEntity(evapControlResponse, EvapControlDto.class);
    }

    @Override
    public EvapControlDto updateData(EvapControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
        evapControlRepository.deleteById(id);
    }

    private EvapControl retrieveEvapControlById(Long id) {
        return evapControlRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Evaporator control data", "id", id));
    }
}
