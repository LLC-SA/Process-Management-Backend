package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.process.Pasteurizer;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.process.PasteurizerDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.process.PasteurizerRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.PasteurizerService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PasteurizerServiceImpl implements PasteurizerService {

    private PasteurizerRepository pasteurizerRepository;

    public PasteurizerServiceImpl(PasteurizerRepository pasteurizerRepository) {
        this.pasteurizerRepository = pasteurizerRepository;
    }

    @Override
    public PasteurizerDto getDataById(Long id) {
        Pasteurizer data = retrievePasteurizerDataById(id);
        return DtoMapper.entityToDto(data, PasteurizerDto.class);
    }

    @Override
    public List<PasteurizerDto> getAllDataByDate(String date) {
        List<Pasteurizer> dataList = pasteurizerRepository.findAllByCreatedDate(LocalDate.parse(date));

        return dataList.stream().map(data -> DtoMapper.entityToDto(data, PasteurizerDto.class)).toList();
    }

    @Override
    public PasteurizerDto createData(PasteurizerDto dto) {
        Pasteurizer dataDB = DtoMapper.dtoToEntity(dto, Pasteurizer.class);
        Pasteurizer savedData = pasteurizerRepository.save(dataDB);

        return DtoMapper.entityToDto(savedData, PasteurizerDto.class);
    }

    @Override
    public PasteurizerDto updateData(@NotNull PasteurizerDto dto, Long id) {
        Pasteurizer dataDB = retrievePasteurizerDataById(id);
        dataDB.setFlowRate(dto.getFlowRate());
        dataDB.setHotWaterTemp(dto.getHotWaterTemp());
        dataDB.setPasteurizationTemp(dto.getPasteurizationTemp());

        Pasteurizer savedData = pasteurizerRepository.save(dataDB);
        return DtoMapper.entityToDto(savedData, PasteurizerDto.class);
    }

    @Override
    public void deleteDataById(Long id) {
        Pasteurizer dataDB = retrievePasteurizerDataById(id);
        pasteurizerRepository.deleteById(id);
    }

    private Pasteurizer retrievePasteurizerDataById(Long id) {
        Pasteurizer pasteurizerData = pasteurizerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Pasteurizer data", "id", id));

        return pasteurizerData;
    }
}
