package com.LLC.ProductionProcess.productionProcess.packaging.service.impl;

import com.LLC.ProductionProcess.productionProcess.packaging.entity.PackingProcessOne;
import com.LLC.ProductionProcess.productionProcess.packaging.payload.PackingProcessOneDto;
import com.LLC.ProductionProcess.productionProcess.packaging.repository.PackingProcessOneRepository;
import com.LLC.ProductionProcess.productionProcess.packaging.service.intf.PackingProcessOneService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackingProcessOneServiceImpl implements PackingProcessOneService {
    PackingProcessOneRepository packingProcessOneRepository;

    public PackingProcessOneServiceImpl(PackingProcessOneRepository packingProcessOneRepository) {
        this.packingProcessOneRepository = packingProcessOneRepository;
    }

    @Override
    public PackingProcessOneDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<PackingProcessOneDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public PackingProcessOneDto createData(PackingProcessOneDto dto) {
        PackingProcessOne inputData = DtoMapper.dtoToEntity(dto, PackingProcessOne.class);
        PackingProcessOne savedDataInDB = packingProcessOneRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, PackingProcessOneDto.class);
    }

    @Override
    public PackingProcessOneDto updateData(PackingProcessOneDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
