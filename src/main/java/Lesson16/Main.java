package main.java.Lesson16;

public class Main {
    public static void main(String[] args) {
        CashDesk cashDesk1 = new CashDesk("One");
        CashDesk cashDesk2 = new CashDesk("Two");
        CashDesk cashDesk3 = new CashDesk("Three");

        cashDesk1.start();
        cashDesk2.start();
       
    }
}


