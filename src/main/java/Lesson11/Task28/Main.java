package main.java.Lesson11.Task28;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList();
        for (int i = 0; i < 20; i++) {
            number.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(number);
        int maximum = number.get(0);
        Iterator<Integer> iterator = number.iterator();
        maximum = number.get(0);

        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n > maximum) {
                maximum = n;
            }
        }
        System.out.println(maximum);
    }
}

