package com.LLC.ProductionProcess.productionProcess.evaporation.controller.crystallizer;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.EvapCrystallizerDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvapCrystallizer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/evaporation/crystallizers")
public class EvapCrystallizerController {

    private EvapCrystallizer evapCrystallizer;

    public EvapCrystallizerController(EvapCrystallizer evapCrystallizer) {
        this.evapCrystallizer = evapCrystallizer;
    }

    @GetMapping("/{id}")
    public EvapCrystallizerDto getAllCrystallizerById(@PathVariable Long id) {
        return evapCrystallizer.getDataById(id);
    }

    @GetMapping("/date")
    public List<EvapCrystallizerDto> getCrystallizersByDate(@RequestParam(name = "date") String date) {
        return evapCrystallizer.getAllDataByDate(date);
    }

    @PostMapping
    public ResponseEntity<EvapCrystallizerDto> createCrystallizerDetail(@RequestBody EvapCrystallizerDto evapCrystallizerDto) {
        EvapCrystallizerDto createCrystallizer = evapCrystallizer.createData(evapCrystallizerDto);

        return new ResponseEntity<>(createCrystallizer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EvapCrystallizerDto> updateCrystallizer(@PathVariable Long id, @RequestBody EvapCrystallizerDto evapCrystallizerDto) {

        EvapCrystallizerDto updatedCrystallizer = evapCrystallizer.updateData(evapCrystallizerDto, id);
        return new ResponseEntity<>(updatedCrystallizer, HttpStatus.OK);
    }
}
