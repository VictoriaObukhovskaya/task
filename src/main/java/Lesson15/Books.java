package main.java.Lesson15;

import java.io.Serializable;

public class Books implements Serializable {
    private String name;
    private String author;


    public Books(String name, String author) {
        this.name = name;
        this.author = author;

    }


    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return name;

    }

}
