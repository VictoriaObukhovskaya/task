package main.java.Lesson16;

public class Buyer extends Thread {
    public String name;

    public Buyer(String name) {
        this.name = name;

    }

    public Buyer() {

    }

    public void run() {
        System.out.print(this.getName() + " at the cash desk № " + CashDesk.getCashDesk() + ": ");
    }
}
