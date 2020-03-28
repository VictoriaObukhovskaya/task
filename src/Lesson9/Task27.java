package Lesson9;
import java.util.HashSet;
import java.util.Set;

public class Task27 {
    public static void main(String[] args) {
        Set collection = new HashSet();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(1);
        collection.add(4);
        collection.add(5);
        collection.add(3);
        collection.add(2);
        collection.add(7);
        for (Object o : collection) {
            System.out.print(o);
        }
    }
}
