package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.EvaporatorProcess;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.process.EvaporatorDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.process.EvaporatorRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvaporatorService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EvaporatorServiceImpl implements EvaporatorService {

    private EvaporatorRepository evaporatorRepository;

    public EvaporatorServiceImpl(EvaporatorRepository evaporatorRepository) {
        this.evaporatorRepository = evaporatorRepository;
    }

    @Override
    public EvaporatorDto getDataById(Long id) {
        EvaporatorProcess dataDB = retrieveEvaporatorById(id);
        return DtoMapper.entityToDto(dataDB, EvaporatorDto.class);
    }

    @Override
    public List<EvaporatorDto> getAllDataByDate(String date) {
        List<EvaporatorProcess> dataList = evaporatorRepository.findAllByCreatedDate(LocalDate.parse(date));
        return dataList.stream().map(data -> DtoMapper.entityToDto(data, EvaporatorDto.class)).toList();
    }

    @Override
    public EvaporatorDto createData(EvaporatorDto dto) {
        EvaporatorProcess dataDB = DtoMapper.dtoToEntity(dto, EvaporatorProcess.class);
        EvaporatorProcess savedData = evaporatorRepository.save(dataDB);

        return DtoMapper.entityToDto(savedData, EvaporatorDto.class);
    }

    @Override
    public EvaporatorDto updateData(EvaporatorDto dto, Long id) {
        EvaporatorProcess dataDB = retrieveEvaporatorById(id);

        dataDB.setBoilerSteamPressure(dto.getBoilerSteamPressure());
        dataDB.setEvaporatorSteamPressure(dto.getEvaporatorSteamPressure());
        dataDB.setCoolingTowerIn(dto.getCoolingTowerIn());
        dataDB.setCoolingTowerOut(dto.getCoolingTowerOut());
        dataDB.setEffectOneTemp(dto.getEffectOneTemp());
        dataDB.setEffectTwoTemp(dto.getEffectTwoTemp());
        dataDB.setEffectThreeTemp(dto.getEffectThreeTemp());
        dataDB.setFlashTemp(dto.getFlashTemp());
        dataDB.setVacuumPressure(dto.getVacuumPressure());
        dataDB.setProductOutput(dto.getProductOutput());
        dataDB.setProductSolids(dto.getProductSolids());

        EvaporatorProcess updatedDataDB = evaporatorRepository.save(dataDB);
        return DtoMapper.entityToDto(updatedDataDB, EvaporatorDto.class);
    }

    @Override
    public void deleteDataById(Long id) {
        EvaporatorProcess dataDB = retrieveEvaporatorById(id);
        evaporatorRepository.deleteById(id);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private EvaporatorProcess retrieveEvaporatorById(Long id) {
        EvaporatorProcess evapData = evaporatorRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Evaporator data", "id", id));

        return evapData;
    }
}
