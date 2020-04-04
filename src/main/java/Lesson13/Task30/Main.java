package main.java.Lesson13.Task30;

public class Main {
    public static void main(String[] args) {
        File file = new File("./text.txt");
        String text = "Скоро весь сад, согретый солнцем, обласканный, ожил, и капли росы, как алмазы, засверкали на листьях.";
        File.record(file, text);
        File.read(file);
        int countWord = 0;
        int sentenceCount = 0;
        String[] wordList = text.split("\\s");
        countWord += wordList.length;
        String[] sentenceList = text.split("[!?,.—:;]");
        sentenceCount += sentenceList.length;
        System.out.println("\nword count = " + countWord);
        System.out.println("number of punctuation marks = " + sentenceCount);
    }
}
