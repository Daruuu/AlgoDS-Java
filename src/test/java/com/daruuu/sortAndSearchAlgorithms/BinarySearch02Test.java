package com.daruuu.sortAndSearchAlgorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearch02Test {

    @Test
    void shoudlReturnTrue_whenTargetExists() {

        //  given
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(11);

        int target = 7;

        //  when
        boolean resultBoolean = BinarySearch02.findTargetInSortedArrayUsingBinarySearch(arrayList, target);

        //  then
        assertTrue(resultBoolean, "Is correct.");
    }
}