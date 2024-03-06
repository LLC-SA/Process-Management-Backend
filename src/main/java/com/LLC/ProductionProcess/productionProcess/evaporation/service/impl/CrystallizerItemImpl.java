package com.LLC.ProductionProcess.productionProcess.evaporation.service.impl;

import com.LLC.ProductionProcess.exception.ApiException;
import com.LLC.ProductionProcess.exception.ResourceNotFoundException;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.Crystallizer;
import com.LLC.ProductionProcess.productionProcess.evaporation.entity.crystallizer.CrystallizerItem;
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
        List<CrystallizerItem> crystallizerItems = crystallizerItemRepository.findByCrystallizerId(crystallizerId);

        List<CrystallizerItemDto> crystallizerDetailsDto = crystallizerItems.stream()
                .map(detail -> DtoMapper.entityToDto(detail, CrystallizerItemDto.class)).toList();

        return crystallizerDetailsDto;
    }

    @Override
    public CrystallizerItemDto createData(Long crystallizerId, CrystallizerItemDto crystallizerData) {
        CrystallizerItem crystallizerItem = DtoMapper.dtoToEntity(crystallizerData, CrystallizerItem.class);

        // Retrieve the detail by the crystallizer - id
        Crystallizer crystallizer = retrieveCrystallizerById(crystallizerId);

        // Set the crystallizer-detail to the crystallizer --> ManyToOne relationship bidirectional
        crystallizerItem.setCrystallizer(crystallizer);

        // Save the detail into de database
        CrystallizerItem savedCrystallizerItem = crystallizerItemRepository.save(crystallizerItem);

        return DtoMapper.entityToDto(savedCrystallizerItem, CrystallizerItemDto.class);
    }

    @Override
    public CrystallizerItemDto updateData(Long crystallizerId, Long crystallizerDetailId, CrystallizerItemDto crystallizerItemDto) {
        // Retrieve the "One"
        Crystallizer crystallizer = retrieveCrystallizerById(crystallizerId);

        // Retrieve the "Many" (the for the update)
        CrystallizerItem crystallizerItem = retrieveCrystallizerDetailById(crystallizerDetailId);

        // Check if the detail belongs to the crystallizer
        if (!crystallizerItem.getCrystallizer().getId().equals(crystallizer.getId())) {
            throw new ApiException(HttpStatus.BAD_REQUEST, "The detail does not belong to the crystallizer");
        }

        // Set the updated data
        crystallizerItem.setPasteurizationTemperature(crystallizerItemDto.getPasteurizationTemperature());
        crystallizerItem.setCoolingTemperature(crystallizerItemDto.getCoolingTemperature());
        crystallizerItem.setProductConcentration(crystallizerItemDto.getProductConcentration());

        CrystallizerItem updatedCrystallizer = crystallizerItemRepository.save(crystallizerItem);
        return DtoMapper.entityToDto(updatedCrystallizer, CrystallizerItemDto.class);
    }

    /* ################################################################################################################# */
    /* PRIVATE METHODS */
    /* ################################################################################################################# */

    private Crystallizer retrieveCrystallizerById(Long crystallizerId) {
        Crystallizer crystallizer = crystallizerRepository.findById(crystallizerId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer", "crystallizerId", crystallizerId));

        return crystallizer;
    }

    private CrystallizerItem retrieveCrystallizerDetailById(Long crystallizerDetailId) {
        CrystallizerItem crystallizerItem = crystallizerItemRepository.findById(crystallizerDetailId)
                .orElseThrow(() -> new ResourceNotFoundException("crystallizer_detail", "crystallizerDetailId", crystallizerDetailId));

        return crystallizerItem;
    }
}
