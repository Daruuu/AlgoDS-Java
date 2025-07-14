package com.daruuu.LeetCode.dynamicprogramming;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @Test
    void    shouldReturnZero_whenInputIsZero() {
        assertEquals(0 , FibonacciNumber.fib(0));
    }

    @Test
    void    shouldReturnOne_whenInputIsOne() {
        assertEquals(1 , FibonacciNumber.fib(1));
    }

    @Test
    void    shouldReturnOne_whenInputIsTwo() {
        assertEquals(1 , FibonacciNumber.fib(2));
    }

    @ParameterizedTest(name = "fib({0}) = {1}")
    @MethodSource("provideFibonacciValues")
    void    shouldReturnCorrectFibonacciValue_givenInputN(int input, int expected)
    {
        assertEquals(expected, FibonacciNumber.fibIterative(input));
    }
    static Stream<Arguments> provideFibonacciValues()
    {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5),
                Arguments.of(6, 8),
                Arguments.of(7, 13),
                Arguments.of(8, 21),
                Arguments.of(9, 34),
                Arguments.of(10, 55),
                Arguments.of(15, 610),
                Arguments.of(20, 6765),
                Arguments.of(25, 75025),
                Arguments.of(30, 832040)
        );
    }
}