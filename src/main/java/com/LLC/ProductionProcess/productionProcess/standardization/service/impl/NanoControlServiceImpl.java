package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.payload.nanofiltration.NanoControlDto;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.NanoControlService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NanoControlServiceImpl implements NanoControlService {


    @Override
    public NanoControlDto getDataById(Long id) {
        return null;
    }

    @Override
    public List<NanoControlDto> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public NanoControlDto createData(NanoControlDto dto) {
//        SprayControl inputData = DtoMapper.dtoToEntity(dto, SprayControl.class);
//        SprayControl savedDataInDB = sprayControlRepository.save(inputData);
//
//        return DtoMapper.dtoToEntity(savedDataInDB, SprayControlDto.class);
        return null;


    }

    @Override
    public NanoControlDto updateData(NanoControlDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
