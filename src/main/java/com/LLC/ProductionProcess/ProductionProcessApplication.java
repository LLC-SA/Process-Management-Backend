package com.LLC.ProductionProcess;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(/*exclude = {DataSourceAutoConfiguration.class*}**/)
public class ProductionProcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductionProcessApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
