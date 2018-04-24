package com.study;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private int[] testArray;
    private int[] sortedArray;

    @Before
    public void init() {
        testArray = new int[]{2, 3, 5, 1, 4, 6};
        sortedArray = new int[]{1, 2, 3, 4, 5, 6};
    }

    @Test
    public void sortTest() {
        BubbleSort.sort(testArray);
        System.out.println(Arrays.toString(testArray));
        assertArrayEquals(sortedArray, testArray);
    }

}