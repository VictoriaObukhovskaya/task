package main.java.Lesson5.Task20;

public class Main {
    public static void main(String[] args) {
        String str = "Без труда не выловишь и рыбку из пруда";
        StringBuilder totalstr = new StringBuilder();
        String[] words = str.trim().split("\\s+");
        for (String word : words) {
            totalstr.append(word.charAt(word.length() - 1));
        }

        System.out.println(totalstr);
    }
}
