package com.example.ConversorDeMoedas.services;

public interface IConversor {
    <T> T getData(String json, Class<T> classInput);
}
