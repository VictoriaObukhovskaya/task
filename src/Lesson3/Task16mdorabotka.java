public class Task16mdorabotka {
    public static void main(String[] args) {
        int[] a = new int[15];
        System.out.print("Первоначальный массив ");
        for (int i = 0; i < 15; i++) {
            a[i] = (int) (Math.random() * 10 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.print(" Новый массив ");
        for (int i = 0, j = (a.length - 1); i < (a.length / 2); i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int value : a) {
            System.out.print(value + " ");
        }
    }
}