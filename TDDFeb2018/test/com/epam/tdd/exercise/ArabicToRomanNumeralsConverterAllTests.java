package com.epam.tdd.exercise;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Class to run all tests for converter.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArabicToRomanNumeralsConverterParametrisedTest.class,
        ArabicToRomanNumeralsConverterNegativeTests.class
})
public class ArabicToRomanNumeralsConverterAllTests {
}
