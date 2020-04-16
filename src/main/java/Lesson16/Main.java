package main.java.Lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<String> products = Arrays.asList(
                "kefir, oranges, pasta",
                "baguette, cookies, rice",
                "apples, tomatoes, cabbage",
                "apricots, peanut, ham",
                "cheese, cocoa, melon");
        Random rand = new Random();
        String randomElement1 = products.get(rand.nextInt(products.size()));
        String randomElement2 = products.get(rand.nextInt(products.size()));
        String randomElement3 = products.get(rand.nextInt(products.size()));
        String randomElement4 = products.get(rand.nextInt(products.size()));
        String randomElement5 = products.get(rand.nextInt(products.size()));

        Buyer buyer1 = new Buyer();
        Buyer buyer2 = new Buyer();
        Buyer buyer3 = new Buyer();
        Buyer buyer4 = new Buyer();
        Buyer buyer5 = new Buyer();

        buyer1.start();
        buyer1.join();
        System.out.println(randomElement1);
        buyer2.start();
        buyer2.join();
        System.out.println(randomElement2);
        buyer3.start();
        buyer3.join();
        System.out.println(randomElement3);
        buyer4.start();
        buyer4.join();
        System.out.println(randomElement4);
        buyer5.start();
        buyer5.join();
        System.out.println(randomElement5);
    }
}

