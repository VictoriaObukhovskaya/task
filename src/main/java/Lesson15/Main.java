package main.java.Lesson15;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final String path = "./books/book titles.txt";
        List<Books> books = Arrays.asList(
                new Books("Белые ночи", "Фёдор Достоевский"),
                new Books("Война и мир", "Лев Толстой"),
                new Books("Анна Каренина", "Лев Толстой"),
                new Books("Братья Карамазовы", "Фёдор Достоевский"),
                new Books(" Мастер и Маргарита", "Михаил Булгаков"));
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(books);
        outputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        List<Books> newbooks;
        newbooks = (List<Books>) inputStream.readObject();

        inputStream.close();
        fileInputStream.close();
        inputStream.close();
        fileInputStream.close();
        newbooks.stream()
                .collect(Collectors.groupingBy(Books::getAuthor))
                .entrySet().forEach(System.out::println);
    }
}

