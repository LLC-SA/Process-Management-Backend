package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.Crystallizer;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystallizerDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystallizerRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystallizerService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CrystallizerServiceImpl implements CrystallizerService {

    CrystallizerRepository crystallizerRepository;

    public CrystallizerServiceImpl(CrystallizerRepository crystallizerRepository) {
        this.crystallizerRepository = crystallizerRepository;
    }

    @Override
    public CrystallizerDto getDataById(Long id) {
        Crystallizer crystallizer = retrieveCrystallizerById(id);
        CrystallizerDto crystallizerDto = DtoMapper.entityToDto(crystallizer, CrystallizerDto.class);
//
        return crystallizerDto;
    }

    @Override
    public List<CrystallizerDto> getAllDataByDate(String date) {
        List<Crystallizer> crystallizers = crystallizerRepository.findAllByCreatedDate(LocalDate.parse(date));
        List<CrystallizerDto> crystallizersdDto = crystallizers.stream().map(crystallizer -> DtoMapper.entityToDto(crystallizer, CrystallizerDto.class)).toList();

        return crystallizersdDto;
    }

    @Override
    public CrystallizerDto createData(CrystallizerDto dto) {
        Crystallizer crystallizer = DtoMapper.dtoToEntity(dto, Crystallizer.class);
        Crystallizer crystallizerResponse = crystallizerRepository.save(crystallizer);
//
        return DtoMapper.dtoToEntity(crystallizerResponse, CrystallizerDto.class);
    }

    @Override
    public CrystallizerDto updateData(CrystallizerDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
        Crystallizer crystallizer = retrieveCrystallizerById(id);
        crystallizerRepository.deleteById(id);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private Crystallizer retrieveCrystallizerById(Long id) {

        Crystallizer crystallizerData = crystallizerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Crystallizer data", "id", id));

        return crystallizerData;
    }
}

