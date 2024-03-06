package com.LLC.ProductionProcess.productionProcess.evaporation.controller.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystallizerDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.CrystallizerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/crystallizers")
public class CrystallizerController {

    private CrystallizerService crystallizerService;

    public CrystallizerController(CrystallizerService crystallizerService) {
        this.crystallizerService = crystallizerService;
    }

    @GetMapping("/{id}")
    public CrystallizerDto getAllCrystallizerById(@PathVariable Long id) {
        return crystallizerService.getDataById(id);
    }

    @GetMapping("/date")
    public List<CrystallizerDto> getCrystallizersByDate(@RequestParam(name = "date") String date) {
        return crystallizerService.getAllDataByDate(date);
    }

    @PostMapping
    public ResponseEntity<CrystallizerDto> createCrystallizerDetail(@RequestBody CrystallizerDto crystallizerDto) {
        CrystallizerDto createCrystallizer = crystallizerService.createData(crystallizerDto);

        return new ResponseEntity<>(createCrystallizer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CrystallizerDto> updateCrystallizer(@PathVariable Long id, @RequestBody CrystallizerDto crystallizerDto) {

        CrystallizerDto updatedCrystallizer = crystallizerService.updateData(crystallizerDto, id);
        return new ResponseEntity<>(updatedCrystallizer, HttpStatus.OK);
    }
}
