package com.example;

import java.util.concurrent.RecursiveTask;

public class NoFindMaxTask extends RecursiveTask<Integer> {
    private final int threshold;
    private final int[] myArray;
    private int start;
    private int end;

    public NoFindMaxTask(int[] myArray, int start, int end, int threshold) {
        this.threshold = threshold;
        this.myArray = myArray;
        this.start = start;
        this.end = end;
    }

    protected Integer compute() {
        if (end - start < threshold) {
            int max = Integer.MIN_VALUE;
            for (int i = start; i <= end; i++) {
                int n = myArray[i];
                if (n > max) {
                    max = n;
                }
            }
            return max;
        } else {
            int midway = (end - start) / 2 + start;
            NoFindMaxTask a1 = new NoFindMaxTask(myArray, start, midway, threshold);
            a1.fork();
            NoFindMaxTask a2 = new NoFindMaxTask(myArray, midway + 1, end, threshold);           
            return Math.max(a2.compute(), a1.join());
        }
    }
}