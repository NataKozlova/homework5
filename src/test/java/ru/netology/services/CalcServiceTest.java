package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {
    @ParameterizedTest
    @CsvSource({
            "10000,3000,20000,3",
            "100000,60000,150000,2"
    })
    void shouldCalculate(int income, int expense, int threshold, int expected) {
        CalcService calcService = new CalcService();
        int actual = calcService.calculate(income,expense,threshold);

        Assertions.assertEquals(expected, actual);
    }
}
