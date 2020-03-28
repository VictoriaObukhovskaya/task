package Lesson9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("ВВедите символы");
        String string = num.nextLine();
        String[] words = string.split("\\s+");
        Map<String, Integer> wordrepeated = new HashMap<>();
        for (String word : words) {
            if (!wordrepeated.containsKey(word)) {
                wordrepeated.put(word, 0);
            }
            wordrepeated.put(word, wordrepeated.get(word) + 1);
        }
        for (String word : wordrepeated.keySet()) {
            System.out.println(word + " " + wordrepeated.get(word));
        }
    }
}

