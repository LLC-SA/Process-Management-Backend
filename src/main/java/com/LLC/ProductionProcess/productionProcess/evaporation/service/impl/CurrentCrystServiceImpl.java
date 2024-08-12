package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CurrentCryst;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CurrentCrystDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CurrentCrystRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CurrentCrystService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CurrentCrystServiceImpl implements CurrentCrystService {

    private CurrentCrystRepository currentCrystRepository;

    public CurrentCrystServiceImpl(CurrentCrystRepository currentCrystRepository) {
        this.currentCrystRepository = currentCrystRepository;
    }

    @Override
    public CurrentCrystDto getDataById(Long id) {
        CurrentCryst currentCryst = retrieveCrystallizerById(id);
        CurrentCrystDto currentCrystDto = DtoMapper.entityToDto(currentCryst, CurrentCrystDto.class);
//
        return currentCrystDto;
    }

    @Override
    public List<CurrentCrystDto> getAllDataByDate(String date) {
        List<CurrentCryst> currentCrysts = currentCrystRepository.findAllByCreatedDate(LocalDate.parse(date));
        List<CurrentCrystDto> crystallizersdDto = currentCrysts.stream().map(currentCryst -> DtoMapper.entityToDto(currentCryst, CurrentCrystDto.class)).toList();

        return crystallizersdDto;
    }

    @Override
    public CurrentCrystDto createData(CurrentCrystDto dto) {
        CurrentCryst currentCryst = DtoMapper.dtoToEntity(dto, CurrentCryst.class);
        CurrentCryst currentCrystResponse = currentCrystRepository.save(currentCryst);
//
        return DtoMapper.dtoToEntity(currentCrystResponse, CurrentCrystDto.class);
    }

    @Override
    public CurrentCrystDto updateData(CurrentCrystDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
        CurrentCryst currentCryst = retrieveCrystallizerById(id);
        currentCrystRepository.deleteById(id);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private CurrentCryst retrieveCrystallizerById(Long id) {

        CurrentCryst currentCrystData = currentCrystRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Crystallizer data", "id", id));

        return currentCrystData;
    }
}

