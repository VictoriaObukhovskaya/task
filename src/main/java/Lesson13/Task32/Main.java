package main.java.Lesson13.Task32;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String path = "./number.txt";
        int[] array = new int[20];
        final Random random = new Random();
        for (int i = 0; i < array.length; ++i)
            array[i] = random.nextInt(9);
        try (final FileWriter writer = new FileWriter(path, false)) {
            for (int i = 0; i < array.length; ++i) {
                final String text = Integer.toString(array[i]);
                writer.write(text);
                writer.flush();

            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
        try (final FileReader reader = new FileReader(path)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        float sum=0;
        for (int i=0;i<array.length;i++)
            sum +=array[i];
        float sr=sum/20;
        System.out.println("\n" +sr);
    }
}




