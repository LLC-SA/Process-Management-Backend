package com.LLC.ProductionProcess.productionProcess.evaporation.controller.process;

import com.LLC.ProductionProcess.productionProcess.evaporation.payload.process.EvaporationControlDto;
import com.LLC.ProductionProcess.productionProcess.evaporation.service.intf.EvaporationControlService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController("/evaporation")
public class EvaporationControlController {

    private EvaporationControlService evapControlService;

    public EvaporationControlController(EvaporationControlService evapControlService) {
        this.evapControlService = evapControlService;
    }

    @GetMapping("/control/{id}")
    public EvaporationControlDto getEvaporationControlDataById(@PathVariable Long id) {
        return evapControlService.getDataById(id);
    }

    @GetMapping("/control/date")
    public List<EvaporationControlDto> getEvaporationControlDataByDate(@RequestParam(name = "date") String date) {
        return evapControlService.getAllDataByDate(date);
    }

    @PostMapping("/control")
    public ResponseEntity<EvaporationControlDto> createEvaporationControlData(@RequestBody EvaporationControlDto evaporationControlDto) {
        EvaporationControlDto createdEvapControlData = evapControlService.createData(evaporationControlDto);

        return new ResponseEntity<>(createdEvapControlData, HttpStatus.CREATED);
    }


    @PutMapping("/control/{id}")
    public ResponseEntity<EvaporationControlDto> updateEvaporationControlData(@PathVariable Long id, @RequestBody EvaporationControlDto evapDto) {

        EvaporationControlDto updatedEvapControl = evapControlService.updateData(evapDto, id);
        return new ResponseEntity<>(updatedEvapControl, HttpStatus.OK);
    }
}
