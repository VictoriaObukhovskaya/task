package Lesson14;
import java.io.*;
import java.util.*;

public class Task32 {
    public static void main(String[] args) {
        int[] array = new int[20];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt(9);

        try (final FileWriter writer = new FileWriter("./numbertext.txt", false)) {
            for (int i = 0; i < array.length; ++i) {
                final String text = Integer.toString(array[i]);
                writer.write(text);
                writer.write(System.lineSeparator());
                System.out.print(text);
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }

        float sum = 0;
        for (int i = 0; i < array.length; ++i)
            sum += array[i];
        float sr = sum / 20;
        System.out.print("\n" + sr);
    }
}
