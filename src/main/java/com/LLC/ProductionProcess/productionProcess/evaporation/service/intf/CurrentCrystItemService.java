package com.LLC.ProductionProcess.productionProcess.evaporation.service.intf;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CurrentCrystItemDto;

import java.util.List;

public interface CurrentCrystItemService {

    List<CurrentCrystItemDto> getDataByCrystallizerId(Long crystallizerId);

    CurrentCrystItemDto createData(Long crystallizerId, CurrentCrystItemDto crystallizerData);

    CurrentCrystItemDto updateData(Long crystallizerId, Long crystallizerDetailId, CurrentCrystItemDto crystallizerDto);
}

