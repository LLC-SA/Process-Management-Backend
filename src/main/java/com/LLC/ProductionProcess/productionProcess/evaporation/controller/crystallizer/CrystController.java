package com.LLC.ProductionProcess.productionProcess.evaporation.controller.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/evaporation/crystallizers")
public class CrystController {

    private CrystService crystService;

    public CrystController(CrystService crystService) {
        this.crystService = crystService;
    }

    @GetMapping("/{id}")
    public CrystDto getAllCrystallizerById(@PathVariable Long id) {
        return crystService.getDataById(id);
    }

    @GetMapping("/date")
    public List<CrystDto> getCrystallizersByDate(@RequestParam(name = "date") String date) {
        return crystService.getAllDataByDate(date);
    }

    @PostMapping
    public ResponseEntity<CrystDto> createCrystallizerDetail(@RequestBody CrystDto crystDto) {
        CrystDto createCrystallizer = crystService.createData(crystDto);

        return new ResponseEntity<>(createCrystallizer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CrystDto> updateCrystallizer(@PathVariable Long id, @RequestBody CrystDto crystDto) {

        CrystDto updatedCrystallizer = crystService.updateData(crystDto, id);
        return new ResponseEntity<>(updatedCrystallizer, HttpStatus.OK);
    }
}
