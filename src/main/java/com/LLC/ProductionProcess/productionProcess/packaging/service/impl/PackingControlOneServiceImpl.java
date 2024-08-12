package com.LLC.ProductionProcess.productionProcess.packaging.service.impl;

import com.LLC.ProductionProcess.productionProcess.packaging.entity.PackingControlOne;
import com.LLC.ProductionProcess.productionProcess.packaging.payload.PackingControlOneDto;
import com.LLC.ProductionProcess.productionProcess.packaging.repository.PackingControlOneRepository;
import com.LLC.ProductionProcess.productionProcess.packaging.service.intf.PackingControlOneService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackingControlOneServiceImpl implements PackingControlOneService {

    private PackingControlOneRepository packingControlOneRepository;

    public PackingControlOneServiceImpl(PackingControlOneRepository packingControlOneRepository) {
        this.packingControlOneRepository = packingControlOneRepository;
    }

    @Override
    public PackingControlOneDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<PackingControlOneDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public PackingControlOneDto createData(PackingControlOneDto dto) {
        PackingControlOne inputData = DtoMapper.dtoToEntity(dto, PackingControlOne.class);
        PackingControlOne savedDataInDB = packingControlOneRepository.save(inputData);

        return DtoMapper.dtoToEntity(savedDataInDB, PackingControlOneDto.class);
    }

    @Override
    public PackingControlOneDto updateData(PackingControlOneDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
