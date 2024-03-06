package com.LLC.ProductionProcess.productionProcess.evaporation.controller.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystallizerItemDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystallizerItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/crystallizer/{crystallizerId}")
public class CrystallizerItemsController {

    private CrystallizerItemService crystallizerItemService;

    public CrystallizerItemsController(CrystallizerItemService crystallizerItemService) {
        this.crystallizerItemService = crystallizerItemService;
    }

    @GetMapping
    public List<CrystallizerItemDto> getAllItemsByCrystallizer(@PathVariable Long crytallizerId) {
        return crystallizerItemService.getDataByCrystallizerId(crytallizerId);
    }

    @PostMapping("/item")
    public ResponseEntity<CrystallizerItemDto> createCrystallizerItem(@PathVariable Long crystallizerId,
                                                                      @RequestBody CrystallizerItemDto crystallizerItemDto) {

        CrystallizerItemDto createItem = crystallizerItemService.createData(crystallizerId, crystallizerItemDto);
        return new ResponseEntity<>(createItem, HttpStatus.CREATED);
    }

    @PutMapping("/item/{id}")
    public ResponseEntity<CrystallizerItemDto> updateCrystallizerDetail(@PathVariable Long crystallizerId,
                                                                        @PathVariable Long id,
                                                                        @RequestBody CrystallizerItemDto crystallizerItemDto) {

        CrystallizerItemDto createItem = crystallizerItemService.updateData(crystallizerId, id, crystallizerItemDto);
        return new ResponseEntity<>(createItem, HttpStatus.OK);
    }
}
