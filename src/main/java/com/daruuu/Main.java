package com.daruuu;

import com.daruuu.HackerRank.minimaxsum04.MiniMaxSum;
import com.daruuu.typesofcomplexity.Exercise01;
import com.daruuu.typesofcomplexity.Exercise02;
import com.daruuu.typesofcomplexity.Exercise03;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
        int     resultExercise01;
        int     resultExercise02;
        int[][] resultExercise03;

        System.out.println("Hello and welcome to Algorithms and Structures!");

        int[]   arrayExercise01 = {10, 20, 30};
        resultExercise01 = Exercise01.getFirstElementOfArray(arrayExercise01);
        System.out.println("Result of exercise 01: " + resultExercise01);

        int[]   arrayExercise02 = {1, 2, 3, 4};
        resultExercise02 = Exercise02.getTheSumOfAllItemsInArray(arrayExercise02);
        System.out.println("Result of exercise 02: " + resultExercise02);

        int[]   arrayExercise03 = {1, 2, 3};
        resultExercise03 = Exercise03.getAllPossibleCombinationsInTheSameArrayValues(arrayExercise03);
        int i = 0;

        while (i < resultExercise03.length)
        {
            System.out.println("(" + resultExercise03[i][0] + ", " + resultExercise03[i][1] + ")");
            i++;
        }
*/
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        MiniMaxSum.minimaxSum(array);
    }
}