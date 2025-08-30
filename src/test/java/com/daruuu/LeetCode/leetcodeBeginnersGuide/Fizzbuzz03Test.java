package com.daruuu.LeetCode.leetcodeBeginnersGuide;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Fizzbuzz03Test {

    @Test
    void    shouldReturnAListWithAllElements_whenNIsGreatherThanZero() {

        //  given
        int nInput  = 3;
        List<String> expectedOutput = List.of("1","2","Fizz");

        //  when
        List<String>    resultList= Fizzbuzz03.fizzBuzz(nInput);

        //  then
        assertEquals(expectedOutput, resultList);
    }

    @Test
    void    shouldReturnCorrectList_whenNIs5() {
        int n = 5;
        List<String> expected = List.of("1", "2", "Fizz", "4", "Buzz");
        assertEquals(expected, Fizzbuzz03.fizzBuzz(n));
    }

    @Test
    void    shouldReturnFizzBuzz_whenNIs15() {
        int n = 15;
        List<String> expected = List.of(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        );
        assertEquals(expected, Fizzbuzz03.fizzBuzz(n));
    }


}