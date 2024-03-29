package com.LLC.ProductionProcess;

import com.LLC.ProductionProcess.generics.service.ProcessService;
import com.LLC.ProductionProcess.productionProcess.evaporation.payload.crystallizer.CrystallizerDto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AppCommandLineRunner implements CommandLineRunner {

    private ProcessService<CrystallizerDto> crystallizerService;

    public AppCommandLineRunner(ProcessService<CrystallizerDto> crystallizerService) {
        this.crystallizerService = crystallizerService;
    }

    @Override
    public void run(String... args) throws Exception {

//        CrystallizerDto crystallizerDto = crystallizerService.createData(new CrystallizerDto(null, 545, "5", "Yes", "SPD", "5462", "S3", 6.92, 25, 1777));
//        CrystallizerDto crystallizerDto1 = crystallizerService.getDataById(1L);

//        List<CrystallizerDto> all = crystallizerService.getAllDataByDate("2024-02-16");
//        System.out.println(crystallizerDto1);
//        all.forEach(System.out::println);
        System.out.println(LocalDate.now());
    }

}
