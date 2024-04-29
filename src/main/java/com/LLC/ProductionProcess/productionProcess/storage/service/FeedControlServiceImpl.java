package com.LLC.ProductionProcess.productionProcess.storage.service;

import com.LLC.ProductionProcess.productionProcess.storage.entity.FeedControl;
import com.LLC.ProductionProcess.productionProcess.storage.payload.FeedControlDto;
import com.LLC.ProductionProcess.productionProcess.storage.repository.FeedControlRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedControlServiceImpl implements FeedControlService {

    FeedControlRepository feedControlRepository;

    @Override
    public FeedControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<FeedControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public FeedControlDto createData(FeedControlDto dto) {
        FeedControl inputData = DtoMapper.dtoToEntity(dto, FeedControl.class);
        FeedControl savedDataInDB = feedControlRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, FeedControlDto.class);
    }

    @Override
    public FeedControlDto updateData(FeedControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
