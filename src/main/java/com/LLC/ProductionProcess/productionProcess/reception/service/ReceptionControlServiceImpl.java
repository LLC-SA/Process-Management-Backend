package com.LLC.ProductionProcess.productionProcess.reception.service;

import com.LLC.ProductionProcess.productionProcess.reception.entity.ReceptionControl;
import com.LLC.ProductionProcess.productionProcess.reception.payload.ReceptionControlDto;
import com.LLC.ProductionProcess.productionProcess.reception.repository.ReceptionControlRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionControlServiceImpl implements ReceptionControlService {

    private ReceptionControlRepository receptionControlRepository;

    public ReceptionControlServiceImpl(ReceptionControlRepository receptionControlRepository) {
        this.receptionControlRepository = receptionControlRepository;
    }

    @Override
    public ReceptionControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<ReceptionControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public ReceptionControlDto createData(ReceptionControlDto dto) {
        ReceptionControl inputData = DtoMapper.dtoToEntity(dto, ReceptionControl.class);
        ReceptionControl savedDataInDB = receptionControlRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, ReceptionControlDto.class);
    }

    @Override
    public ReceptionControlDto updateData(ReceptionControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
