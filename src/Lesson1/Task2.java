public class Task2 {
    public static void main (String[] args) {
        int s = 3700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int has = h % 60;
        int st = (h- has) / 24;
        int sutki = st % 24;
        int ndl = (st - sutki) / 7;
        System.out.println( ndl + " недели " + sutki + " сутки " + has + " часов " + min + " минут " + sec + "секунд");
    }
}
