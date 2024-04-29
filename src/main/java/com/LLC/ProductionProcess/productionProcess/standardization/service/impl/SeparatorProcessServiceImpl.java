package com.LLC.ProductionProcess.productionProcess.standardization.service.impl;

import com.LLC.ProductionProcess.productionProcess.standardization.entity.cream_separator.SeparatorProcess;
import com.LLC.ProductionProcess.productionProcess.standardization.service.intf.SeparatorProcessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeparatorProcessServiceImpl implements SeparatorProcessService {
    @Override
    public SeparatorProcess getDataById(Long id) {
        return null;
    }

    @Override
    public List<SeparatorProcess> getAllDataByDate(String date) {
        return null;
    }

    @Override
    public SeparatorProcess createData(SeparatorProcess dto) {
        return null;
    }

    @Override
    public SeparatorProcess updateData(SeparatorProcess dto, Long id) {
        return null;
    }

    @Override
    public void deleteDataById(Long id) {

    }
}
