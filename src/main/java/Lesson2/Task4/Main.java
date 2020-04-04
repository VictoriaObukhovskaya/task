package main.java.Lesson2.Task4;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int r, a, b;
        System.out.println(" ВВедите радиус круга ");
        r = num.nextInt();
        System.out.println(" ВВедите a ");
        a = num.nextInt();
        System.out.println(" ВВедите b ");
        b = num.nextInt();
        if ( r * r >= ( a * a + b * b) / 4)
            System.out.println( " Можно");
        else
            System.out.println( " Нельзя");

    }
}

