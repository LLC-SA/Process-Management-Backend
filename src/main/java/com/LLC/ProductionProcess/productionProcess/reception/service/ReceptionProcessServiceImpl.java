package com.LLC.ProductionProcess.productionProcess.reception.service;

import com.LLC.ProductionProcess.productionProcess.reception.entity.ReceptionProcess;
import com.LLC.ProductionProcess.productionProcess.reception.payload.ReceptionProcessDto;
import com.LLC.ProductionProcess.productionProcess.reception.repository.ReceptionProcessRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceptionProcessServiceImpl implements ReceptionProcessService {

    ReceptionProcessRepository receptionProcessRepository;

    public ReceptionProcessServiceImpl(ReceptionProcessRepository receptionProcessRepository) {
        this.receptionProcessRepository = receptionProcessRepository;
    }

    @Override
    public ReceptionProcessDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<ReceptionProcessDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public ReceptionProcessDto createData(ReceptionProcessDto dto) {
        ReceptionProcess inputData = DtoMapper.dtoToEntity(dto, ReceptionProcess.class);
        ReceptionProcess savedDataInDB = receptionProcessRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, ReceptionProcessDto.class);
    }

    @Override
    public ReceptionProcessDto updateData(ReceptionProcessDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
