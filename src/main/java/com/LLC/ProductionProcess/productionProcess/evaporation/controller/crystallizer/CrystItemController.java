package com.LLC.ProductionProcess.productionProcess.evaporation.controller.crystallizer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController("/evaporation/crystallizer/{crystallizerId}")
public class CrystItemController {

//    private CrystItemService crystItemService;
//
//    public CrystItemController(CrystItemService crystItemService) {
//        this.crystItemService = crystItemService;
//    }
//
//    @GetMapping
//    public List<CrystItemDto> getAllItemsByCrystallizer(@PathVariable Long crytallizerId) {
//        return crystItemService.getDataByCrystallizerId(crytallizerId);
//    }
//
//    @PostMapping("/items")
//    public ResponseEntity<CrystItemDto> createCrystallizerItem(@PathVariable Long crystallizerId,
//                                                               @RequestBody CrystItemDto crystItemDto) {
//
//        CrystItemDto createItem = crystItemService.createData(crystallizerId, crystItemDto);
//        return new ResponseEntity<>(createItem, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/item/{id}")
//    public ResponseEntity<CrystItemDto> updateCrystallizerDetail(@PathVariable Long crystallizerId,
//                                                                 @PathVariable Long id,
//                                                                 @RequestBody CrystItemDto crystItemDto) {
//
//        CrystItemDto createItem = crystItemService.updateData(crystallizerId, id, crystItemDto);
//        return new ResponseEntity<>(createItem, HttpStatus.OK);
//    }
}
