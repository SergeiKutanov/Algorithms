package com.sergeik.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergei on 04.07.16.
 */
public class InsertionSort {

    public static int[] sort(int[] data) {

        int key;
        int i;

        for (int j = 1; j < data.length; j++) {
            key = data[j];
            i = j - 1;
            while (i >= 0 && data[i] > key) {
                data[i + 1] = data[i];
                i = i - 1;
            }
            data[i+1] = key;
        }

        return data;
    }

}
