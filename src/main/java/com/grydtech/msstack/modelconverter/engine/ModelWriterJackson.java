package com.grydtech.msstack.modelconverter.engine;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.grydtech.msstack.modelconverter.common.Model;

import java.io.File;
import java.io.IOException;

public class ModelWriterJackson implements ModelWriter {
    private static ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    public void writeModel(File file, Model model) {
        try {
            objectMapper.writeValue(file, model);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
