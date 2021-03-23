package org.example.homework12;

import java.util.concurrent.Callable;

public class RangeSummator implements Callable<Integer> {
    private int a;
    private int b;

    public RangeSummator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i=a; i<=b; i++){
            sum+=i;
        }
        return sum;
    }
}
