package com.daruuu.HackerRank.minimaxsum04;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MiniMaxSumTest {

    @Test
    void    shouldReturnValidNumber_minimaxSum() {
        //  given
        List<Integer>   integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);

        String  expectedOutput = "10 14";

        //  capture the output log
        ByteArrayOutputStream   outcontent = new ByteArrayOutputStream();
        PrintStream originalOutConsole = System.out;
        System.setOut(new PrintStream(outcontent));

        //  when
        try {
            MiniMaxSum.minimaxSum(integerArrayList);

            //  then
            String  actualOutput = outcontent.toString().trim();
            assertEquals(expectedOutput, actualOutput);
        } finally {
            System.setOut(originalOutConsole);
        }
    }
}