package com.example;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Neil
 */
public class NoRandomArrayAction extends RecursiveAction{
    private final int threshold;
    private final int[] myArray;
    private int start;
    private int end;
    
    public NoRandomArrayAction(int[] myArray, int start, int end, int threshold) {
        this.myArray = myArray;
        this.start = start;
        this.end = end;
        this.threshold = threshold;
    }
    
    @Override
    protected void compute(){
        if (end - start < threshold) {
            for (int i = start; i <= end; i++) {
                myArray[i] = ThreadLocalRandom.current().nextInt();
            }
        } else {
            int midway = (end - start) / 2 + start;
            NoRandomArrayAction r1 = new NoRandomArrayAction (myArray, start, midway, threshold);
            NoRandomArrayAction r2 = new NoRandomArrayAction (myArray, start, midway + 1, threshold);
            invokeAll(r1, r2);
        }
    }
}
