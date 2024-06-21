package com.example.ConversorDeMoedas.services;

import com.example.ConversorDeMoedas.model.CoinData;

public class SearchOnAPI {
    private final String codeBase;
    private final String secondCodeBase;
    private final Double valueOfConversion;
    private final String apiToken = System.getenv("API_TOKEN");

    public SearchOnAPI(String codeBase, String secondCodeBase, Double valueOfConversion) {
        this.codeBase = codeBase;
        this.secondCodeBase = secondCodeBase;
        this.valueOfConversion = valueOfConversion;
    }

    public void search() {
        var consumerApi = new ConsumerAPI();
        var json = consumerApi
                .getData("https://v6.exchangerate-api.com/v6/" + apiToken + "/latest/" + codeBase);
        GsonConversor conversor = new GsonConversor();
        CoinData data = conversor.getData(json, CoinData.class);
        var resultConvert = new CalculatorConversion(data, secondCodeBase, valueOfConversion);
        System.out.println(resultConvert.calculator());
    }
}

