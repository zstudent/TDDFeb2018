package com.epam.tdd.exercise;

/**
 * Interface for numerals converters.
 */
public interface NumeralsConverter {
    /**
     * Convert the given number from one numeric system to the correcponding number from another
     * numeric system,depending from implementation.
     *
     * @param toConvert string, that represents number from one numeric system
     * @return @code(String) the converted given number of another numeric system
     */
    String convert(String toConvert);
}
