package com.LLC.ProductionProcess.productionProcess.evaporation.service.intf;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystItemDto;

import java.util.List;

public interface CrystItemService {

    List<CrystItemDto> getDataByCrystallizerId(Long crystallizerId);

    CrystItemDto createData(Long crystallizerId, CrystItemDto crystallizerData);

    CrystItemDto updateData(Long crystallizerId, Long crystallizerDetailId, CrystItemDto crystallizerDto);
}

