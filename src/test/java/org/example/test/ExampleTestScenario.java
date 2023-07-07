package org.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTestScenario {

    @Test
    public void exampleTestCaseNamedMeaningfullyTestCase() {
        // GIVEN - prepare data here
        int valueA = 6;
        int valueB = 10;

        // WHEN - test subject
        int result = maxMethod(6, 10);

        // THEN - test assertions
        Assertions.assertEquals(10, result);
    }

    private int maxMethod(int a, int b) {
        return Math.max(a, b);
    }
}