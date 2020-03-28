package Lesson6.Task23;

import java.util.Scanner;

public class Operationmethod {
    private static int seebalance = 7000;
    public static void put() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите добавить");
        int putcash = input.nextInt();
        if (putcash % 10 != 0) {
            System.out.println("Неверная сумма");
        } else {
            System.out.println("Сумма добавления " + putcash);
            seebalance += putcash;
            System.out.println("Ваш балан после добавления " + seebalance);
        }
    }

    public static void take() {
        int naminal100 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сумму, которую хотите снять");
        int takecash = input.nextInt();
        if (takecash % 10 != 0 || seebalance < takecash) {
            System.out.println("Неверная сумма");
        } else {
            System.out.println("Сумма добавления " + takecash);
            seebalance -= takecash;
            System.out.println("Ваш балан после добавления " + seebalance);
                }

        }
}
          






