package com.LLC.ProductionProcess.productionProcess.cip_checks.service;

import com.LLC.ProductionProcess.productionProcess.cip_checks.entity.EquipmentCip;
import com.LLC.ProductionProcess.productionProcess.cip_checks.payload.EquipmentCipDto;
import com.LLC.ProductionProcess.productionProcess.cip_checks.repository.EquipmentCipRepository;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentCipServiceImpl implements EquipmentCipService {

    private EquipmentCipRepository equipmentCipRepository;

    public EquipmentCipServiceImpl(EquipmentCipRepository equipmentCipRepository) {
        this.equipmentCipRepository = equipmentCipRepository;
    }

    @Override
    public EquipmentCipDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<EquipmentCipDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public EquipmentCipDto createData(EquipmentCipDto dto) {
        EquipmentCip dataDB = DtoMapper.dtoToEntity(dto, EquipmentCip.class);
        EquipmentCip savedData = equipmentCipRepository.save(dataDB);
        
        return DtoMapper.entityToDto(savedData, EquipmentCipDto.class);
    }

    @Override
    public EquipmentCipDto updateData(EquipmentCipDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
