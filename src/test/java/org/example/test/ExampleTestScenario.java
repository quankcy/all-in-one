package org.example.test;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTestScenario {

    @Test
    public void exampleTestCaseNamedMeaningfully() {
        // GIVEN - prepare data here
        int valueA = 6;
        int valueB = 10;

        // WHEN - test subject
        int result = maxMethod(valueA, valueB);

        // THEN - test assertions
        Assertions.assertEquals(10, result);
    }

    private int maxMethod(int a, int b) {
        return Math.max(a, b);
    }

    public String stub_zaslepka(String asd){
        return "Poznakowski";
    }

    public String mock_sterownika(String qwe){
        return new Faker().name().lastName();
    }

}
