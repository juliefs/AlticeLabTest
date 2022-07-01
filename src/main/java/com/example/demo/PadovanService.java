package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PadovanService {

    public String getPadovan(Integer index) {

        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        int nextNumber;

        String series = "";

        series = "0 "+firstNumber + " " + secondNumber + " " + thirdNumber;

        for (int i = 1; i <= index - 3; i++) {

            nextNumber = secondNumber + firstNumber;
            series = series.concat(" ").concat(String.valueOf(nextNumber));
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = nextNumber;

        }

        return series;

    }
}
