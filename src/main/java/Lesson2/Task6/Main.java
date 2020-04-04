package main.java.Lesson2.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int d, m, g, dmax;
        System.out.println(" ВВедите день ");
        d = num.nextInt();
        System.out.println(" ВВедите месяц ");
        m = num.nextInt();
        System.out.println(" ВВедите год ");
        g = num.nextInt();

        if (d == 31 && m == 12) {
            d = 1;
            m = 1;
            g++;
            System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
        } else if (m == 2 && (((d == 28) && (g % 4 != 0)) || ((d == 29) && ((g % 4 == 0))))) {
            d = 1;
            m++;
            System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
        } else if (((d == 31)) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
            d = 1;
            m++;
            System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
        } else if ((d == 30) && (m == 4 || m == 6 || m == 9 || m == 11)) {
            d = 1;
            m++;
            System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
        } else {
            if (m == 2 && (((d > 28) && (g % 4 != 0)) || ((d > 29) && (g % 4 == 0)))) {
                d = 1;
                m++;
                System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
            }
            if (((d > 31)) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
                d = 1;
                m++;
                System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
            }
            if ((d > 30) && (m == 4 || m == 6 || m == 9 || m == 11)) {
                d = 1;
                m++;
                System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
            }
            {
                d++;
                System.out.println(" Дата следующего дня " + g + " : " + m + " : " + d);
            }


        }
    }
}

