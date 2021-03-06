package com.sergeik;

import com.sergeik.generators.IntArrayGenerator;
import com.sergeik.sort.InsertionSort;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Insertion Sort Test");

        int[] dataNotSorted = IntArrayGenerator.generateArray(1000);
        int[] originalArray = dataNotSorted.clone();
        int[] dataSorted = InsertionSort.sort(dataNotSorted);

        System.out.println("Insertion Sort Test End");

    }


}
