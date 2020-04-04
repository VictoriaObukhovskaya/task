package main.java.Lesson4.Task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);
        System.out.println(" Введите количество элементов массива");
        n = num.nextInt();
        int a[] = new int[n];
        int max = a[0];
        int Maxnumber = 0;
        int min = a[0] + 1;
        int Minnumber = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(" Введите a" + i + "=");
            a[i] = num.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            Minnumber = i;
            for (int j = 0; j < a.length; j++)
                if (a[Minnumber] > a[j])
                    Minnumber = j;
        }
        for (int i = 0; i < a.length; i++) {
            Maxnumber = i;
            for (int j = 0; j < a.length; j++)
                if (a[Maxnumber] < a[j])
                    Maxnumber = j;
        }
        int sum = 0;
        if (Minnumber < Maxnumber)
            for (int j = Minnumber + 1; j < Maxnumber; j++)
                sum += a[j];
        else
            for (int j = Maxnumber + 1; j < Minnumber; j++)
                sum += a[j];
        System.out.println("сумма =" + sum);
    }
}












