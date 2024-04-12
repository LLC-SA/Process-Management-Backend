package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ApiException;
import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizer;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.EvapCrystallizerItemDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystallizerItemRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CrystallizerRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvapCrystallizerItem;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvapCrystallizerItemImpl implements EvapCrystallizerItem {

    CrystallizerItemRepository crystallizerItemRepository;
    CrystallizerRepository crystallizerRepository;

    public EvapCrystallizerItemImpl(CrystallizerItemRepository crystallizerItemRepository,
                                    CrystallizerRepository crystallizerRepository) {
        this.crystallizerItemRepository = crystallizerItemRepository;
        this.crystallizerRepository = crystallizerRepository;
    }

    @Override
    public List<EvapCrystallizerItemDto> getDataByCrystallizerId(Long crystallizerId) {
        // ERROR //
        List<EvapCrystallizerItem> evapCrystallizerItems = crystallizerItemRepository.findByCrystallizerId(crystallizerId);

        List<EvapCrystallizerItemDto> crystallizerDetailsDto = evapCrystallizerItems.stream()
                .map(detail -> DtoMapper.entityToDto(detail, EvapCrystallizerItemDto.class)).toList();

        return crystallizerDetailsDto;
    }

    @Override
    public EvapCrystallizerItemDto createData(Long crystallizerId, EvapCrystallizerItemDto crystallizerData) {
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem evapCrystallizerItem = DtoMapper.dtoToEntity(crystallizerData, com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem.class);

        // Retrieve the detail by the crystallizer - id
        EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(crystallizerId);

        // Set the crystallizer-detail to the crystallizer --> ManyToOne relationship bidirectional
        evapCrystallizerItem.setEvapCrystallizer(evapCrystallizer);

        // Save the detail into de database
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem savedEvapCrystallizerItem = crystallizerItemRepository.save(evapCrystallizerItem);

        return DtoMapper.entityToDto(savedEvapCrystallizerItem, EvapCrystallizerItemDto.class);
    }

    @Override
    public EvapCrystallizerItemDto updateData(Long crystallizerId, Long crystallizerDetailId, EvapCrystallizerItemDto evapCrystallizerItemDto) {
        // Retrieve the "One"
        EvapCrystallizer evapCrystallizer = retrieveCrystallizerById(crystallizerId);

        // Retrieve the "Many" (the for the update)
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem evapCrystallizerItem = retrieveCrystallizerDetailById(crystallizerDetailId);

        // Check if the detail belongs to the crystallizer
        if (!evapCrystallizerItem.getEvapCrystallizer().getId().equals(evapCrystallizer.getId())) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "The detail does not belong to the crystallizer");
        }

        // Set the updated data
        evapCrystallizerItem.setPasteurizationTemperature(evapCrystallizerItemDto.getPasteurizationTemperature());
        evapCrystallizerItem.setCoolingTemperature(evapCrystallizerItemDto.getCoolingTemperature());
        evapCrystallizerItem.setProductConcentration(evapCrystallizerItemDto.getProductConcentration());

        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem updatedCrystallizer = crystallizerItemRepository.save(evapCrystallizerItem);
        return DtoMapper.entityToDto(updatedCrystallizer, EvapCrystallizerItemDto.class);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */

    private EvapCrystallizer retrieveCrystallizerById(Long crystallizerId) {
        EvapCrystallizer evapCrystallizer = crystallizerRepository.findById(crystallizerId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer", "crystallizerId", crystallizerId));

        return evapCrystallizer;
    }

    private com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem retrieveCrystallizerDetailById(Long crystallizerDetailId) {
        com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.EvapCrystallizerItem evapCrystallizerItem = crystallizerItemRepository.findById(crystallizerDetailId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer_detail", "crystallizerDetailId", crystallizerDetailId));

        return evapCrystallizerItem;
    }
}
