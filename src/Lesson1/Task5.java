import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        int v;
        System.out.println(" ВВедите сумму ");
        v = num.nextInt();
        if ( v % 100 >= 11 && v % 100 <= 20) {
            System.out.println( " рублей "); }
        else if ( v % 10 == 1 )
        {
            System.out.println(" рубль");}
        else if ( v % 10 == 2 || v % 10 == 3 || v % 10 == 4 ) {
            System.out.println( " рубля"); }
        else {
            System.out.println(" рублей ");
        }
     }
}
