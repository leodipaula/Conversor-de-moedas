package com.example.ConversorDeMoedas.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record CoinData(@SerializedName("conversion_rates") Map<String, Double> conversionRates) {
}
