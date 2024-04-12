package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.EvapCrystallizerDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystallizerRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvapCrystallizer;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EvapCrystallizerImpl implements EvapCrystallizer {

    CrystallizerRepository crystallizerRepository;

    public EvapCrystallizerImpl(CrystallizerRepository crystallizerRepository) {
        this.crystallizerRepository = crystallizerRepository;
    }

    @Override
    public EvapCrystallizerDto getDataById(Long id) {
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(id);
        EvapCrystallizerDto evapCrystallizerDto = DtoMapper.entityToDto(evapCrystallizer, EvapCrystallizerDto.class);
//
        return evapCrystallizerDto;
    }

    @Override
    public List<EvapCrystallizerDto> getAllDataByDate(String date) {
        List<com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer> evapCrystallizers = crystallizerRepository.findAllByCreatedDate(LocalDate.parse(date));
        List<EvapCrystallizerDto> crystallizersdDto = evapCrystallizers.stream().map(evapCrystallizer -> DtoMapper.entityToDto(evapCrystallizer, EvapCrystallizerDto.class)).toList();

        return crystallizersdDto;
    }

    @Override
    public EvapCrystallizerDto createData(EvapCrystallizerDto dto) {
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer evapCrystallizer = DtoMapper.dtoToEntity(dto, com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer.class);
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer evapCrystallizerResponse = crystallizerRepository.save(evapCrystallizer);
//
        return DtoMapper.dtoToEntity(evapCrystallizerResponse, EvapCrystallizerDto.class);
    }

    @Override
    public EvapCrystallizerDto updateData(EvapCrystallizerDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(id);
        crystallizerRepository.deleteById(id);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer retrieveCrystallizerById(Long id) {

        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer evapCrystallizerData = crystallizerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Crystallizer data", "id", id));

        return evapCrystallizerData;
    }
}

