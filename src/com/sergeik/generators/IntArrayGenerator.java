package com.sergeik.generators;

import java.util.Random;

/**
 * Created by sergei on 04.07.16.
 */
public class IntArrayGenerator {

    public static int[] generateArray(int length) {
        int[] data = new int[length];

        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(1000);
        }

        return data;
    }

}
