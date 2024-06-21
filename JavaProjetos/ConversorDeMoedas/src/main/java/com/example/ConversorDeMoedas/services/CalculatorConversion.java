package com.example.ConversorDeMoedas.services;

import com.example.ConversorDeMoedas.model.CoinData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorConversion {
    private String codeBase;
    private CoinData data;
    private Double valueOfConversion;

    public CalculatorConversion(CoinData data, String codeBase, Double valueOfConversion) {
        this.codeBase = codeBase;
        this.data = data;
        this.valueOfConversion = valueOfConversion;
    }

    private String[] extractConversionRates() {
        String dataString = data.toString();
        String ratesPart = dataString.substring(dataString.indexOf("{") + 1, dataString.lastIndexOf("}"));

        Pattern pattern = Pattern.compile("(\\w+)=([\\d.]+)");
        Matcher matcher = pattern.matcher(ratesPart);

        ArrayList<String> ratesList = new ArrayList<>();

        while (matcher.find()) {
            ratesList.add(matcher.group());
        }
        return ratesList.toArray(new String[0]);
    }

    public String calculator() {
        Optional<String> stream = Arrays.stream(extractConversionRates())
                .filter(x -> x.startsWith(codeBase + "="))
                .findAny();
        if (stream.isEmpty()) {
            return "Código base não encontrado";
        }
        String[] split = stream.get().split("=");
        Double taxOfConversion = Double.parseDouble(split[1]) * valueOfConversion;
        return taxOfConversion.toString();
    }
}