package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystallizerDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystallizerRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystallizerService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CrystallizerServiceImpl implements CrystallizerService {

    CrystallizerRepository crystallizerRepository;

    public CrystallizerServiceImpl(CrystallizerRepository crystallizerRepository) {
        this.crystallizerRepository = crystallizerRepository;
    }

    @Override
    public CrystallizerDto getDataById(Long id) {
        EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(id);
        CrystallizerDto crystallizerDto = DtoMapper.entityToDto(evapCrystallizer, CrystallizerDto.class);
//
        return crystallizerDto;
    }

    @Override
    public List<CrystallizerDto> getAllDataByDate(String date) {
        List<EvapCrystallizer> evapCrystallizers = crystallizerRepository.findAllByCreatedDate(LocalDate.parse(date));
        List<CrystallizerDto> crystallizersdDto = evapCrystallizers.stream().map(evapCrystallizer -> DtoMapper.entityToDto(evapCrystallizer, CrystallizerDto.class)).toList();

        return crystallizersdDto;
    }

    @Override
    public CrystallizerDto createData(CrystallizerDto dto) {
        EvapCrystallizer evapCrystallizer = DtoMapper.dtoToEntity(dto, EvapCrystallizer.class);
        EvapCrystallizer evapCrystallizerResponse = crystallizerRepository.save(evapCrystallizer);
//
        return DtoMapper.dtoToEntity(evapCrystallizerResponse, CrystallizerDto.class);
    }

    @Override
    public CrystallizerDto updateData(CrystallizerDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
        EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(id);
        crystallizerRepository.deleteById(id);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private EvapCrystallizer retrieveCrystallizerById(Long id) {

        EvapCrystallizer evapCrystallizerData = crystallizerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Crystallizer data", "id", id));

        return evapCrystallizerData;
    }
}

