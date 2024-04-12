package com.LLC.ProductionProcess.productionProcess.evaporation.controller.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystItemDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/evaporation/crystallizer/{crystallizerId}")
public class CrystItemController {

    private CrystItemService crystItemService;

    public CrystItemController(CrystItemService crystItemService) {
        this.crystItemService = crystItemService;
    }

    @GetMapping
    public List<CrystItemDto> getAllItemsByCrystallizer(@PathVariable Long crytallizerId) {
        return crystItemService.getDataByCrystallizerId(crytallizerId);
    }

    @PostMapping("/items")
    public ResponseEntity<CrystItemDto> createCrystallizerItem(@PathVariable Long crystallizerId,
                                                               @RequestBody CrystItemDto crystItemDto) {

        CrystItemDto createItem = crystItemService.createData(crystallizerId, crystItemDto);
        return new ResponseEntity<>(createItem, HttpStatus.CREATED);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<CrystItemDto> updateCrystallizerDetail(@PathVariable Long crystallizerId,
                                                                 @PathVariable Long id,
                                                                 @RequestBody CrystItemDto crystItemDto) {

        CrystItemDto createItem = crystItemService.updateData(crystallizerId, id, crystItemDto);
        return new ResponseEntity<>(createItem, HttpStatus.OK);
    }
}
