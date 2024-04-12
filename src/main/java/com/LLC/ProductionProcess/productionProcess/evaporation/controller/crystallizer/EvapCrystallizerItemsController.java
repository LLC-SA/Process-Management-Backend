package com.LLC.ProductionProcess.productionProcess.evaporation.controller.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.EvapCrystallizerItemDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvapCrystallizerItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/evaporation/crystallizer/{crystallizerId}")
public class EvapCrystallizerItemsController {

    private EvapCrystallizerItem evapCrystallizerItem;

    public EvapCrystallizerItemsController(EvapCrystallizerItem evapCrystallizerItem) {
        this.evapCrystallizerItem = evapCrystallizerItem;
    }

    @GetMapping
    public List<EvapCrystallizerItemDto> getAllItemsByCrystallizer(@PathVariable Long crytallizerId) {
        return evapCrystallizerItem.getDataByCrystallizerId(crytallizerId);
    }

    @PostMapping("/item")
    public ResponseEntity<EvapCrystallizerItemDto> createCrystallizerItem(@PathVariable Long crystallizerId,
                                                                          @RequestBody EvapCrystallizerItemDto evapCrystallizerItemDto) {

        EvapCrystallizerItemDto createItem = evapCrystallizerItem.createData(crystallizerId, evapCrystallizerItemDto);
        return new ResponseEntity<>(createItem, HttpStatus.CREATED);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<EvapCrystallizerItemDto> updateCrystallizerDetail(@PathVariable Long crystallizerId,
                                                                            @PathVariable Long id,
                                                                            @RequestBody EvapCrystallizerItemDto evapCrystallizerItemDto) {

        EvapCrystallizerItemDto createItem = evapCrystallizerItem.updateData(crystallizerId, id, evapCrystallizerItemDto);
        return new ResponseEntity<>(createItem, HttpStatus.OK);
    }
}
