package com.LLC.ProductionProcess.productionProcess.storage.service;

import com.LLC.ProductionProcess.productionProcess.storage.entity.PowderToStorage;
import com.LLC.ProductionProcess.productionProcess.storage.payload.PowderToStorageDto;
import com.LLC.ProductionProcess.productionProcess.storage.repository.PowderToStorageRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;

import java.util.List;

public class PowderToStorageServiceImpl implements PowderToStorageService {

    private PowderToStorageRepository powderToStorageRepository;

    public PowderToStorageServiceImpl(PowderToStorageRepository powderToStorageRepository) {
        this.powderToStorageRepository = powderToStorageRepository;
    }

    @Override
    public PowderToStorageDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<PowderToStorageDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public PowderToStorageDto createData(PowderToStorageDto dto) {
        PowderToStorage inputData = DtoMapper.dtoToEntity(dto, PowderToStorage.class);
        PowderToStorage savedDataInDB = powderToStorageRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, PowderToStorageDto.class);
    }

    @Override
    public PowderToStorageDto updateData(PowderToStorageDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
