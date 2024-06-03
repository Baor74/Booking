package com.example.demo.controller.entity;

import jakarta.persistence.AttributeConverter;

public class BooleanConverter implements AttributeConverter<Boolean, Byte>{

    @Override
    public Byte convertToDatabaseColumn(Boolean attribute) {
        return attribute == null ? null : attribute ? (byte) 1 : (byte) 0;
    }

    @Override
    public Boolean convertToEntityAttribute(Byte dbData) {
        return dbData == null ? null : dbData != 0;
    }

}
