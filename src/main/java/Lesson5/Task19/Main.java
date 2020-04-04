package main.java.Lesson5.Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("ВВедите символы");
        String input = num.nextLine();
        String[] arrayOfWords = input.split(" ");
        int n = 0;
        for (String arrayOfWord : arrayOfWords) {
            if (arrayOfWord.length() > 0) {
                n++;
            }
        }
        System.out.println("Слов в тексте " + n);
    }
}


