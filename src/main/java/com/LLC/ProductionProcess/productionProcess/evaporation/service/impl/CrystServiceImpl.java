package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.Cryst;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CrystServiceImpl implements CrystService {

    CrystRepository crystRepository;

    public CrystServiceImpl(CrystRepository crystRepository) {
        this.crystRepository = crystRepository;
    }

    @Override
    public CrystDto getDataById(Long id) {
        Cryst cryst = retrieveCrystallizerById(id);
        CrystDto crystDto = DtoMapper.entityToDto(cryst, CrystDto.class);
//
        return crystDto;
    }

    @Override
    public List<CrystDto> getAllDataByDate(String date) {
        List<Cryst> crysts = crystRepository.findAllByCreatedDate(LocalDate.parse(date));
        List<CrystDto> crystallizersdDto = crysts.stream().map(cryst -> DtoMapper.entityToDto(cryst, CrystDto.class)).toList();

        return crystallizersdDto;
    }

    @Override
    public CrystDto createData(CrystDto dto) {
        Cryst cryst = DtoMapper.dtoToEntity(dto, Cryst.class);
        Cryst crystResponse = crystRepository.save(cryst);
//
        return DtoMapper.dtoToEntity(crystResponse, CrystDto.class);
    }

    @Override
    public CrystDto updateData(CrystDto dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {
        Cryst cryst = retrieveCrystallizerById(id);
        crystRepository.deleteById(id);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private Cryst retrieveCrystallizerById(Long id) {

        Cryst crystData = crystRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Crystallizer data", "id", id));

        return crystData;
    }
}

