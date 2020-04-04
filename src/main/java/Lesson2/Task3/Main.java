package main.java.Lesson2.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int v;
        System.out.println(" ВВедите число ");
        v = num.nextInt();
        if (v % 10 == 7)
            System.out.println(" Является");
        else
            System.out.println(" Не является");

    }
}

