package com.LLC.ProductionProcess.productionProcess.evaporation.service.intf;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystallizerItemDto;

import java.util.List;

public interface CrystallizerItemService {

    List<CrystallizerItemDto> getDataByCrystallizerId(Long crystallizerId);

    CrystallizerItemDto createData(Long crystallizerId, CrystallizerItemDto crystallizerData);

    CrystallizerItemDto updateData(Long crystallizerId, Long crystallizerDetailId, CrystallizerItemDto crystallizerDto);
}

