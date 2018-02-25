package com.epam.tdd.exercise;

import java.util.TreeMap;

/**
 * Class to convert arabic numbers to roman, works for numbers from 1 to 3999 inclusive.
 */
public class ArabicToRomanNumeralsConverter implements NumeralsConverter {
    static TreeMap<Integer, String> auxMap;

    //initialize auxiliary map
    static {
        auxMap = new TreeMap<>();
        auxMap.put(1, "I");
        auxMap.put(4, "IV");
        auxMap.put(5, "V");
        auxMap.put(9, "IX");
        auxMap.put(10, "X");
        auxMap.put(40, "XL");
        auxMap.put(50, "L");
        auxMap.put(90, "XC");
        auxMap.put(100, "C");
        auxMap.put(400, "CD");
        auxMap.put(500, "D");
        auxMap.put(900, "CM");
        auxMap.put(1000, "M");
    }

    /**
     * Convert the arabic number to roman.
     *
     * @param toConvert arabic number to convert
     * @return @code(String) the corresponding roman number
     * @throws IllegalArgumentException ic case if the given arabic value to convert is not
     *                                  belong to range from 1 to 3999 inclusive
     */
    @Override
    public String convert(String toConvert) {
        int toConvertInteger = Integer.parseInt(toConvert);
        if (toConvertInteger < 1 || toConvertInteger > 3999) {
            throw new IllegalArgumentException(String.format("Permitted arabic number to convert " +
                    "must be in range from 1 to 3999: %s", toConvert));
        }
        int nearest = auxMap.floorKey(toConvertInteger);
        if (nearest == toConvertInteger) return auxMap.get(toConvertInteger);
        return auxMap.get(nearest) + convert(
                Integer.toString(toConvertInteger - nearest));
    }
}
