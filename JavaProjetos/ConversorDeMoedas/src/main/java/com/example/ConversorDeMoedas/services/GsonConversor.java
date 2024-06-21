package com.example.ConversorDeMoedas.services;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonConversor implements IConversor {
    private Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();
    @Override
    public <T> T getData(String json, Class<T> classInput) {
        return gson.fromJson(json, classInput);
    }
}
