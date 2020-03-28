package Lesson4;
import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        String str = "Без труда не выловишь и рыбку из пруда";
 StringBuilder totalstr = new StringBuilder();
        String[] words = str.trim().split("\\s+");
        for(String word : words) {
            totalstr.append(word.charAt(word.length()-1));
        }

        System.out.println(totalstr);
    }
}