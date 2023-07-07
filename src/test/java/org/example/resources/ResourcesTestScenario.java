package org.example.resources;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ResourcesTestScenario {

    @Test
    public void readSomeFileResourceTestCase() throws IOException {
//        ResourcesTestScenario.class.getClassLoader().getResource("SomeFile.txt");
        InputStream resourceAsStream = ResourcesTestScenario.class.getClassLoader().getResourceAsStream("SomeFile.txt");
        byte[] bytes = resourceAsStream.readAllBytes();

        String textFromFile = new String(bytes, StandardCharsets.UTF_8);

        Assertions.assertEquals("SomeData", textFromFile);
    }

}
