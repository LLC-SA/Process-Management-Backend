package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.EvapProcess;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.process.EvapProcessDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.process.EvapProcessRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvapProcessService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EvapProcessServiceImpl implements EvapProcessService {

    private EvapProcessRepository evapProcessRepository;

    public EvapProcessServiceImpl(EvapProcessRepository evapProcessRepository) {
        this.evapProcessRepository = evapProcessRepository;
    }

    @Override
    public EvapProcessDto getDataById(Long id) {
        EvapProcess dataDB = retrieveEvaporatorById(id);
        return DtoMapper.entityToDto(dataDB, EvapProcessDto.class);
    }

    @Override
    public List<EvapProcessDto> getAllDataByDate(String date) {
        List<EvapProcess> dataList = evapProcessRepository.findAllByCreatedDate(LocalDate.parse(date));
        return dataList.stream().map(data -> DtoMapper.entityToDto(data, EvapProcessDto.class)).toList();
    }

    @Override
    public EvapProcessDto createData(EvapProcessDto dto) {
        EvapProcess dataDB = DtoMapper.dtoToEntity(dto, EvapProcess.class);
        EvapProcess savedData = evapProcessRepository.save(dataDB);

        return DtoMapper.entityToDto(savedData, EvapProcessDto.class);
    }

    @Override
    public EvapProcessDto updateData(EvapProcessDto dto, Long id) {
        EvapProcess dataDB = retrieveEvaporatorById(id);

        dataDB.setBoilerSteamPressure(dto.getBoilerSteamPressure());
        dataDB.setEvaporatorSteamPressure(dto.getEvaporatorSteamPressure());
        dataDB.setCoolingTowerIn(dto.getCoolingTowerIn());
        dataDB.setCoolingTowerOut(dto.getCoolingTowerOut());
        dataDB.setEffectOneTemp(dto.getEffectOneTemp());
        dataDB.setEffectTwoTemp(dto.getEffectTwoTemp());
        dataDB.setEffectThreeTemp(dto.getEffectThreeTemp());
        dataDB.setFlashTemp(dto.getFlashTemp());
        dataDB.setVacuumPressure(dto.getVacuumPressure());
        dataDB.setProductSolids(dto.getProductSolids());

        EvapProcess updatedDataDB = evapProcessRepository.save(dataDB);
        return DtoMapper.entityToDto(updatedDataDB, EvapProcessDto.class);
    }

    @Override
    public void deleteDataById(Long id) {
        EvapProcess dataDB = retrieveEvaporatorById(id);
        evapProcessRepository.deleteById(id);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private EvapProcess retrieveEvaporatorById(Long id) {
        EvapProcess evapData = evapProcessRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Evaporator data", "id", id));

        return evapData;
    }
}
