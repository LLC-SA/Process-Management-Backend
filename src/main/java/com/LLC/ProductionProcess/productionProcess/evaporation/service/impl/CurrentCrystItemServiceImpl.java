package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ApiException;
import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CurrentCryst;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CurrentCrystItem;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CurrentCrystItemDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CurrentCrystItemRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.repository.crystallizer.CurrentCrystRepository;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CurrentCrystItemService;
import com.LLC.ProductionProcess.utils.DtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrentCrystItemServiceImpl implements CurrentCrystItemService {

    private CurrentCrystItemRepository currentCrystItemRepository;
    private CurrentCrystRepository currentCrystRepository;

    public CurrentCrystItemServiceImpl(CurrentCrystItemRepository currentCrystItemRepository,
                                       CurrentCrystRepository currentCrystRepository) {
        this.currentCrystItemRepository = currentCrystItemRepository;
        this.currentCrystRepository = currentCrystRepository;
    }

    @Override
    public List<CurrentCrystItemDto> getDataByCrystallizerId(Long crystallizerId) {
        // ERROR //
        List<CurrentCrystItem> currentCrystItemServices = currentCrystItemRepository.findByCrystId(crystallizerId);

        List<CurrentCrystItemDto> crystallizerDetailsDto = currentCrystItemServices.stream()
                .map(detail -> DtoMapper.entityToDto(detail, CurrentCrystItemDto.class)).toList();

        return crystallizerDetailsDto;
    }

    @Override
    public CurrentCrystItemDto createData(Long crystallizerId, CurrentCrystItemDto crystallizerData) {
        CurrentCrystItem currentCrystItem = DtoMapper.dtoToEntity(crystallizerData, CurrentCrystItem.class);

        // Retrieve the detail by the crystallizer - id
        CurrentCryst currentCryst = retrieveCrystallizerById(crystallizerId);

        // Set the crystallizer-detail to the crystallizer --> ManyToOne relationship bidirectional
        currentCrystItem.setCurrentCryst(currentCryst);

        // Save the detail into de database
        CurrentCrystItem savedCurrentCrystItem = currentCrystItemRepository.save(currentCrystItem);

        return DtoMapper.entityToDto(savedCurrentCrystItem, CurrentCrystItemDto.class);
    }

    @Override
    public CurrentCrystItemDto updateData(Long crystallizerId, Long crystallizerDetailId, CurrentCrystItemDto currentCrystItemDto) {
        // Retrieve the "One"
        CurrentCryst currentCryst = retrieveCrystallizerById(crystallizerId);

        // Retrieve the "Many" (the for the update)
        CurrentCrystItem currentCrystItem = retrieveCrystallizerDetailById(crystallizerDetailId);

        // Check if the detail belongs to the crystallizer
        if (!currentCrystItem.getCurrentCryst().getId().equals(currentCryst.getId())) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "The detail does not belong to the crystallizer");
        }

        // Set the updated data
        currentCrystItem.setPasteurizationTemperature(currentCrystItemDto.getPasteurizationTemperature());
        currentCrystItem.setCoolingTemperature(currentCrystItemDto.getCoolingTemperature());
        currentCrystItem.setProductConcentration(currentCrystItemDto.getProductConcentration());

        CurrentCrystItem updatedCrystallizer = currentCrystItemRepository.save(currentCrystItem);
        return DtoMapper.entityToDto(updatedCrystallizer, CurrentCrystItemDto.class);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */
    private CurrentCryst retrieveCrystallizerById(Long crystallizerId) {
        CurrentCryst currentCryst = currentCrystRepository.findById(crystallizerId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer", "crystallizerId", crystallizerId));

        return currentCryst;
    }

    private CurrentCrystItem retrieveCrystallizerDetailById(Long crystallizerDetailId) {
        CurrentCrystItem currentCrystItem = currentCrystItemRepository.findById(crystallizerDetailId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer_detail", "crystallizerDetailId", crystallizerDetailId));

        return currentCrystItem;
    }
}
