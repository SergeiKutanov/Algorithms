package com.sergeik.sort;

/**
 * Created by sergei on 04.07.16.
 */
public class MergeSort {

    public static int[] sort(int[] data) {

        if (data.length <= 1) {
            return data;
        }

        int[] first = new int[data.length / 2];
        int[] second = new int[data.length - first.length];

        System.arraycopy(data, 0, first, 0, first.length);
        System.arraycopy(data, first.length, second, 0, second.length);

        sort(first);
        sort(second);

        merge(first, second, data);

        return data;
    }

    private static void merge(int[] first, int[] second, int[] data) {

        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        while(iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                data[iMerged] = first[iFirst];
                iFirst++;
            } else {
                data[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }

        System.arraycopy(first, iFirst, data, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, data, iMerged, second.length - iSecond);

    }
}
