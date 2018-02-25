package com.epam.tdd.exercise;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Class for testing ArabicToRomanNumeralsConverter by parametrized tests.
 */
@RunWith(Parameterized.class)
public class ArabicToRomanNumeralsConverterParametrisedTest {
    private String expected;
    private String toConvert;
    private NumeralsConverter numeralsConverter;

    /**
     * Init the test class for parametrized test.
     */
    public ArabicToRomanNumeralsConverterParametrisedTest(String expected, String toConvert) {
        this.expected = expected;
        this.toConvert = toConvert;
    }

    /**
     * Get class instance.
     *
     * @throws ClassNotFoundException see {@link ClassNotFoundException#ClassNotFoundException()}
     * @throws IllegalAccessException see {@link IllegalAccessException#IllegalAccessException()}
     */
    @Before
    public void setUp() throws Exception {
        numeralsConverter = (NumeralsConverter) Class.forName(this.getClass().getName().replace
                ("ParametrisedTest", "")).newInstance();
    }

    @Parameterized.Parameters
    public static Collection<String[]> setData() throws Exception {
        return Stream.of(Paths.get(ArabicToRomanNumeralsConverterParametrisedTest.class
                .getResource("/com/epam/tdd/data/arabicVsRoman.txt").getPath().replaceFirst(
                        "^/(.:/)", "$1")))
                .parallel()
                .flatMap(path -> {
                    try {
                        return Files.lines(path);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(l -> l.split("="))
                .sorted(Comparator.comparing(a -> a[0], String::compareTo))
                .collect(Collectors.toList());
    }

    /**
     * Test that the converter's result value for each input value is equal to expected.
     *
     * @throws IllegalArgumentException if the input value doesn't belong to range from
     *                                  1 to 3999 inclusive
     */
    @Test
    public void isConvertingArabicToRomanFrom1Till3999() throws Exception {
        assertEquals(
                String.format("Converter's error: expected=%s; actual=%s.", expected, toConvert),
                expected,
                numeralsConverter.convert(toConvert));
    }
}