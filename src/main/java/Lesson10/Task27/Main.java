package main.java.Lesson10.Task27;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }

        System.out.println(list);
        list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        list.forEach(System.out::print);

    }
}

