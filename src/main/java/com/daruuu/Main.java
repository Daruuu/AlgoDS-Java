package com.daruuu;

import com.daruuu.typesofcomplexity.Exercise01;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int     resultExercise01;
        int     resultExercise02;
        int     resultExercise03;

        resultExercise01 = 0;
        resultExercise02 = 0;
        resultExercise03 = 0;

        System.out.println("Hello and welcome to Algorithms and Structures!");

        int[]   arrayExercise01 = {10, 20, 30};
        resultExercise01 = Exercise01.getFirstElementOfArray(arrayExercise01);
        System.out.println("Result of exercise 01: " + resultExercise01);

        int[]   arrayExercise02 = {1, 2, 3, 4};
    }
}