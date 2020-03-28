public class Task17dorabotka {
    public static void main(String[] args) {
        int k = 20;
        int s = 20;
        int[][] a = new int[k][s];
        for (int i = 0; i < a.length / 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((j < i) || (j >= (a[i].length - i)))
                    a[i][j] = 0;
                else
                    a[i][j] = 1;
            }
        }
        for (int i = a.length - 1; i >= a.length / 2; i--) {
            for (int j = 0; j < a[i].length; j++) {
                if ((j < (a[i].length - 1 - i)) || (j > i))
                    a[i][j] = 0;
                else
                    a[i][j] = 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t"); }
            System.out.println(" ");
        }
    }
}
