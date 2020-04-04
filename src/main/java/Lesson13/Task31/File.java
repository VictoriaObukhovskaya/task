package main.java.Lesson13.Task31;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public File(String s) {
    }

    public static void record(File file, String text) {
        try (FileWriter writer = new FileWriter(String.valueOf(file))) {
            writer.write(text);
        } catch (IOException ex) {
            System.out.println("No file");
        }
    }

    public static void read(File file) {
        try (FileReader reader = new FileReader(String.valueOf(file))) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println("File not read");
        }
    }
}
