package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ApiException;
import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystallizerItemDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystallizerItemRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystallizerRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystallizerItemService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrystallizerItemImpl implements CrystallizerItemService {

    CrystallizerItemRepository crystallizerItemRepository;
    CrystallizerRepository crystallizerRepository;

    public CrystallizerItemImpl(CrystallizerItemRepository crystallizerItemRepository,
                                CrystallizerRepository crystallizerRepository) {
        this.crystallizerItemRepository = crystallizerItemRepository;
        this.crystallizerRepository = crystallizerRepository;
    }

    @Override
    public List<CrystallizerItemDto> getDataByCrystallizerId(Long crystallizerId) {
        List<EvapCrystallizerItem> evapCrystallizerItems = crystallizerItemRepository.findByCrystallizerId(crystallizerId);

        List<CrystallizerItemDto> crystallizerDetailsDto = evapCrystallizerItems.stream()
                .map(detail -> DtoMapper.entityToDto(detail, CrystallizerItemDto.class)).toList();

        return crystallizerDetailsDto;
    }

    @Override
    public CrystallizerItemDto createData(Long crystallizerId, CrystallizerItemDto crystallizerData) {
        EvapCrystallizerItem evapCrystallizerItem = DtoMapper.dtoToEntity(crystallizerData, EvapCrystallizerItem.class);

        // Retrieve the detail by the crystallizer - id
        EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(crystallizerId);

        // Set the crystallizer-detail to the crystallizer --> ManyToOne relationship bidirectional
        evapCrystallizerItem.setEvapCrystallizer(evapCrystallizer);

        // Save the detail into de database
        EvapCrystallizerItem savedEvapCrystallizerItem = crystallizerItemRepository.save(evapCrystallizerItem);

        return DtoMapper.entityToDto(savedEvapCrystallizerItem, CrystallizerItemDto.class);
    }

    @Override
    public CrystallizerItemDto updateData(Long crystallizerId, Long crystallizerDetailId, CrystallizerItemDto crystallizerItemDto) {
        // Retrieve the "One"
        EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(crystallizerId);

        // Retrieve the "Many" (the for the update)
        EvapCrystallizerItem evapCrystallizerItem = retrieveCrystallizerDetailById(crystallizerDetailId);

        // Check if the detail belongs to the crystallizer
        if (!evapCrystallizerItem.getEvapCrystallizer().getId().equals(evapCrystallizer.getId())) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "The detail does not belong to the crystallizer");
        }

        // Set the updated data
        evapCrystallizerItem.setPasteurizationTemperature(crystallizerItemDto.getPasteurizationTemperature());
        evapCrystallizerItem.setCoolingTemperature(crystallizerItemDto.getCoolingTemperature());
        evapCrystallizerItem.setProductConcentration(crystallizerItemDto.getProductConcentration());

        EvapCrystallizerItem updatedCrystallizer = crystallizerItemRepository.save(evapCrystallizerItem);
        return DtoMapper.entityToDto(updatedCrystallizer, CrystallizerItemDto.class);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */

    private EvapCrystallizer retrieveCrystallizerById(Long crystallizerId) {
        EvapCrystallizer evapCrystallizer = crystallizerRepository.findById(crystallizerId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer", "crystallizerId", crystallizerId));

        return evapCrystallizer;
    }

    private EvapCrystallizerItem retrieveCrystallizerDetailById(Long crystallizerDetailId) {
        EvapCrystallizerItem evapCrystallizerItem = crystallizerItemRepository.findById(crystallizerDetailId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer_detail", "crystallizerDetailId", crystallizerDetailId));

        return evapCrystallizerItem;
    }
}
