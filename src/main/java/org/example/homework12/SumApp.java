package org.example.homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class SumApp {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a= ");
        a = scanner.nextInt();
        System.out.print("b= ");
        b = scanner.nextInt();
        int sum1=0;

        for (int i=a; i<=b; i++){
            sum1+=i;
        }
        System.out.println("checked sum= "+sum1);
        if ((b - a) < 7) {
            System.out.println("illegal range of numbers < 7 ");
        } else {
            ExecutorService executor = Executors.newFixedThreadPool(4);
            List<Callable<Integer>> tasks = new ArrayList<>();
            tasks.add(new RangeSummator(a, (int)Math.floor((b-a)/4)));
            tasks.add(new RangeSummator((int)Math.floor((b-a)/4)+1, (int)Math.floor((b-a)/2)));
            tasks.add(new RangeSummator((int)Math.floor((b-a)/2)+1, (int)Math.floor((b-a)*3/4)));
            tasks.add(new RangeSummator((int)Math.floor((b-a)*3/4)+1, b));

            List<Future<Integer>> futures = executor.invokeAll(tasks);
            executor.shutdown();
            int sum=0;
            for (Future<Integer>future:futures){
                sum += future.get();
            }
            System.out.println("sum= "+sum);
        }
    }
}
