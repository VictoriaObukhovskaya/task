package main.java.Lesson5.Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("ВВедите символы");
        String input = num.nextLine();
        int n = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (!(Character.isLetterOrDigit(symbol)) && !(Character.isWhitespace(symbol))) {
                n++;
            }
        }
        System.out.println("Общее количество симоволов " + n);
    }
}



