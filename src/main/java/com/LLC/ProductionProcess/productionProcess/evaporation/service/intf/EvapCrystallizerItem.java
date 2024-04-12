package com.LLC.ProductionProcess.productionProcess.evaporation.service.intf;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.EvapCrystallizerItemDto;

import java.util.List;

public interface EvapCrystallizerItem {

    List<EvapCrystallizerItemDto> getDataByCrystallizerId(Long crystallizerId);

    EvapCrystallizerItemDto createData(Long crystallizerId, EvapCrystallizerItemDto crystallizerData);

    EvapCrystallizerItemDto updateData(Long crystallizerId, Long crystallizerDetailId, EvapCrystallizerItemDto crystallizerDto);
}

