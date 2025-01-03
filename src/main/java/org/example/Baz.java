package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Baz {
    class BazThread extends Thread {
        public void run() {
            Integer [] numbers = new Integer[]{1, 2, 3, 4, 5};
            List<Integer> out = new ArrayList<>(Arrays.asList(numbers));

            Iterator<Integer> i = out.iterator();
            double rand = Math.random();
            double number = Math.round(rand);
            System.out.println("Number is " + number + " and rand is " + rand);
            if (number < 0.5) {
                i.next();
                i.next();
                System.out.println("NEXT");
            } else {
                System.out.println("NOT NEXT");
                i.hasNext();
                i.next();
            }
        }
    }

    public void start()  {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            System.out.println("Starting thread " + i);
            BazThread thread = new BazThread();
            thread.start();
            threads.add(thread);
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {}
    }
}
