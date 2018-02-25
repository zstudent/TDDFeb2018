package com.epam.tdd.exercise;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Class for testing ArabicToRomanNumeralsConverter by negative tests.
 */
public class ArabicToRomanNumeralsConverterNegativeTests {
    private static NumeralsConverter numeralsConverter;

    /**
     * Get class instance.
     *
     * @throws ClassNotFoundException see {@link ClassNotFoundException#ClassNotFoundException()}
     * @throws IllegalAccessException see {@link IllegalAccessException#IllegalAccessException()}
     */
    @BeforeClass
    public static void setUp() throws ClassNotFoundException, IllegalAccessException,
            InstantiationException {
        numeralsConverter = (NumeralsConverter) Class.forName(
                ArabicToRomanNumeralsConverterNegativeTests.class.getName().replace(
                        "NegativeTests", "")).newInstance();
    }

    /**
     * Test that illegalArgumentException is throwing if the arabic number to convert lesser than 1.
     *
     * @throws IllegalArgumentException if the input value doesn't belong to range from
     *                                            1 to 3999 inclusive
     */
    @Test(expected = IllegalArgumentException.class)
    public void isThrowsWhenInputValueViolatesLowerRangeBorder() {
        numeralsConverter.convert("0");
    }

    /**
     * Test that illegalArgumentException is throwing if the arabic number to convert bigger than
     * 3999.
     *
     * @throws IllegalArgumentException if the input value doesn't belong to range from
     *                                            1 to 3999 inclusive
     */
    @Test(expected = IllegalArgumentException.class)
    public void isThrowsWhenInputValueViolatesUpperRangeBorder() {
        numeralsConverter.convert("4000");
    }

}