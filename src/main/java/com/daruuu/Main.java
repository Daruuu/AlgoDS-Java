package com.daruuu;

import com.daruuu.LeetCode.beginnerchallengeproblems.NumberOfStepsToReduceANumberToZero_04;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        NumberOfStepsToReduceANumberToZero_04 test = new NumberOfStepsToReduceANumberToZero_04();

        int result = NumberOfStepsToReduceANumberToZero_04.numberOfSteps(14);

        System.out.println("Resultado: " + result);

    }
}

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
/*
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(11);
        int target = 7;

        BinarySearch02.findTargetInSortedArrayUsingBinarySearch(arrayList, target);
*/
    /*
    Write a function called averagePair which, given a sorted array arr of integers and a value  targetAverage,
    returns true if there is a pair of values a and b in the array such that average(a, b) == targetAverage and false otherwise.
    There may be more than one pair that matches the average target.

    [1, 2, 3], 2.5 -> true
    [1, 3, 3, 5, 6, 7, 10, 12, 19], 8 -> true
    [-1, 0, 3, 4, 5, 6], 4.1 -> false
    [], 4 -> false
    [0, 2, 3], 2.0 -> false
    [0, 2, 4], 2.0 -> true
     */
