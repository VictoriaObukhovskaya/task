package main.java.Lesson2.Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a;
        System.out.println(" Введите a");
        a = num.nextInt();
        int b;
        System.out.println(" Введите b ");
        b = num.nextInt();
        int c;
        System.out.println(" Введите c");
        c = num.nextInt();
        int d;
        System.out.println(" Введите d");
        d = num.nextInt();
        int e;
        System.out.println(" Введите e ");
        e = num.nextInt();
        int f;
        System.out.println(" Введите f ");
        f = num.nextInt();


        if ((e >= (a + c)) && (f >= d && f >= b)) {
            System.out.println(" Можно разместить два дома ");
        } else if ((e >= (b + c)) && (f >= d && f >= a)) {
            System.out.println(" Можно разместить два дома");
        } else if ((e >= (b + d)) && (f >= c && f >= a)) {
            System.out.println(" Можно разместить два дома ");
        } else if ((e >= (d + a)) && (f >= b && f >= c)) {
            System.out.println(" Можно разместить два дома");
        } else if ((f >= (a + c)) && (f >= d && f >= b)) {
            System.out.println(" Можно разместить два дома ");
        } else if ((f >= (b + c)) && (f >= d && f >= a)) {
            System.out.println(" Можно разместить два дома");
        } else if ((f >= (b + d)) && (f >= c && f >= a)) {
            System.out.println(" Можно разместить два дома ");
        } else if ((f >= (d + a)) && (f >= b && f >= c)) {
            System.out.println(" Можно разместить два дома");
        } else System.out.println(" Нельзя разместить два дома");
    }
}



