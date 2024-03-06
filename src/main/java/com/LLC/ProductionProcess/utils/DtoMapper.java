package com.LLC.ProductionProcess.utils;

import org.modelmapper.ModelMapper;

public abstract class DtoMapper {

    private static ModelMapper mapper = new ModelMapper();

    public static <T> T entityToDto(Object entity, Class<T> resultClass) {
        T dto;
        dto = mapper.map(entity, resultClass);

        return dto;
    }

    public static <T> T dtoToEntity(Object dto, Class<T> resultClass) {
        T entity;
        entity = mapper.map(dto, resultClass);

        return entity;
    }
}
