package main.java.Lesson17;

public class Main {
    public static void main(String[] args) {
        String address = "E134345810127";
        String check = address.replaceAll(" ", "");
        System.out.println(check);
        boolean result = check.matches("[EDR]\\d{12}");
        if (result) {
            System.out.println("This is the right e-wallet address");
        } else {
            System.out.println("This is not right e-wallet address");
        }
    }
}


