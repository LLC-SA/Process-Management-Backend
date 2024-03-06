package com.LLC.ProductionProcess.generics.service;

import java.util.List;

public interface ProcessService<T> {

    T getDataById(Long id);

    List<T> getAllDataByDate(String date);

    T createData(T dto);

    T updateData(T dto, Long id);

    void deleteDataById(Long id);
}
