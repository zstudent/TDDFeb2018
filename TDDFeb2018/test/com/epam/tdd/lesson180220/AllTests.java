package com.epam.tdd.lesson180220;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({FibonacciNegativeNumbersTest.class,
        FibonacciParameterizedTest.class})
public class AllTests {
}
