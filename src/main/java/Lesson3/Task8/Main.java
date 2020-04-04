package main.java.Lesson3.Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        System.out.println(" Введите n");
        n = num.nextInt();

        long pr = 1;
        int i = 1;
        while (i <= n) {
            pr *= i;
            i++;
        }
        System.out.println("Произмедение чисел" + pr);
    }
}

