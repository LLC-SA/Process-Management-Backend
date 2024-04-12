package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ApiException;
import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.Cryst;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CrystItem;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystItemDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystItemRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystItemService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrystItemServiceImpl implements CrystItemService {

    CrystItemRepository crystItemRepository;
    CrystRepository crystRepository;

    public CrystItemServiceImpl(CrystItemRepository crystItemRepository,
                                CrystRepository crystRepository) {
        this.crystItemRepository = crystItemRepository;
        this.crystRepository = crystRepository;
    }

    @Override
    public List<CrystItemDto> getDataByCrystallizerId(Long crystallizerId) {
        // ERROR //
        List<CrystItem> crystItemServices = crystItemRepository.findByEvapCrystallizerId(crystallizerId);

        List<CrystItemDto> crystallizerDetailsDto = crystItemServices.stream()
                .map(detail -> DtoMapper.entityToDto(detail, CrystItemDto.class)).toList();

        return crystallizerDetailsDto;
    }

    @Override
    public CrystItemDto createData(Long crystallizerId, CrystItemDto crystallizerData) {
        CrystItem crystItem = DtoMapper.dtoToEntity(crystallizerData, CrystItem.class);

        // Retrieve the detail by the crystallizer - id
        Cryst cryst = retrieveCrystallizerById(crystallizerId);

        // Set the crystallizer-detail to the crystallizer --> ManyToOne relationship bidirectional
        crystItem.setCryst(cryst);

        // Save the detail into de database
        CrystItem savedCrystItem = crystItemRepository.save(crystItem);

        return DtoMapper.entityToDto(savedCrystItem, CrystItemDto.class);
    }

    @Override
    public CrystItemDto updateData(Long crystallizerId, Long crystallizerDetailId, CrystItemDto crystItemDto) {
        // Retrieve the "One"
        Cryst cryst = retrieveCrystallizerById(crystallizerId);

        // Retrieve the "Many" (the for the update)
        CrystItem crystItem = retrieveCrystallizerDetailById(crystallizerDetailId);

        // Check if the detail belongs to the crystallizer
        if (!crystItem.getCryst().getId().equals(cryst.getId())) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "The detail does not belong to the crystallizer");
        }

        // Set the updated data
        crystItem.setPasteurizationTemperature(crystItemDto.getPasteurizationTemperature());
        crystItem.setCoolingTemperature(crystItemDto.getCoolingTemperature());
        crystItem.setProductConcentration(crystItemDto.getProductConcentration());

        CrystItem updatedCrystallizer = crystItemRepository.save(crystItem);
        return DtoMapper.entityToDto(updatedCrystallizer, CrystItemDto.class);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */

    private Cryst retrieveCrystallizerById(Long crystallizerId) {
        Cryst cryst = crystRepository.findById(crystallizerId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer", "crystallizerId", crystallizerId));

        return cryst;
    }

    private CrystItem retrieveCrystallizerDetailById(Long crystallizerDetailId) {
        CrystItem crystItem = crystItemRepository.findById(crystallizerDetailId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer_detail", "crystallizerDetailId", crystallizerDetailId));

        return crystItem;
    }
}
