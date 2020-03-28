import java.util.Scanner;
public class Tack9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        System.out.println(" Введите n");
        n = num.nextInt();
        int s = 0;
        int i = n;
        while (i != 0) {
            s += i % 10;
            i /= 10;
        }
        System.out.println("Сумма цифр данного числа" + s);
    }}