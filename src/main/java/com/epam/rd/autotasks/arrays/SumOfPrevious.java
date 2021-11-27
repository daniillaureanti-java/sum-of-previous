package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static boolean[] getSumCheckArray(int[] values) {
        if (values == null || values.length < 2)
            throw new IllegalArgumentException("Illegal argument exception input parameter is null or length less than 2");
        boolean[] rets = new boolean[values.length];
        for (int i = 0; i < values.length; i++) {
            if (i <= 1)
                rets[i] = false;
            else
                rets[i] = values[i] == (values[i-1] + values[i-2]);
        }
        return rets;
    }
}
