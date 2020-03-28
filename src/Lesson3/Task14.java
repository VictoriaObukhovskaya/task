import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        int n;
        Scanner num = new Scanner(System.in);
        System.out.println(" Введите количество элементов массива ");
        n = num.nextInt();
        int a[] = new int[n];
        int max = a[0];
        int Mnumber = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(" Введите a" +i+ "=");
            a[i] = num.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            Mnumber = i;
            for (int j = 0; j < a.length; j++)
                if (a[Mnumber] < a[j])
                    Mnumber = j;
        }
        System.out.println("Номер максимальной оценки =" + Mnumber);
    }
}