package com.LLC.ProductionProcess.productionProcess.evaporation.controller.process;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.process.EvapControlDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvapControlService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/evaporation")
public class EvaporationControlController {

    private EvapControlService evapControlService;

    public EvaporationControlController(EvapControlService evapControlService) {
        this.evapControlService = evapControlService;
    }

    @GetMapping("/control/{id}")
    public EvapControlDto getEvaporationControlDataById(@PathVariable Long id) {
        return evapControlService.getDataById(id);
    }

    @GetMapping("/control/date")
    public List<EvapControlDto> getEvaporationControlDataByDate(@RequestParam(name = "date") String date) {
        return evapControlService.getAllDataByDate(date);
    }

    @PostMapping("/control")
    public ResponseEntity<EvapControlDto> createEvaporationControlData(@RequestBody EvapControlDto evapControlDto) {
        EvapControlDto createdEvapControlData = evapControlService.createData(evapControlDto);

        return new ResponseEntity<>(createdEvapControlData, HttpStatus.CREATED);
    }


    @PutMapping("/control/{id}")
    public ResponseEntity<EvapControlDto> updateEvaporationControlData(@PathVariable Long id, @RequestBody EvapControlDto evapDto) {

        EvapControlDto updatedEvapControl = evapControlService.updateData(evapDto, id);
        return new ResponseEntity<>(updatedEvapControl, HttpStatus.OK);
    }
}
