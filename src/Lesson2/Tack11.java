import java.util.Scanner;
public class Tack11 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        System.out.println(" ВВедите число ");
        n = num.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {

                System.out.println(" Не является");
                return;
            }
        }   System.out.println(" Является ");
           }}


