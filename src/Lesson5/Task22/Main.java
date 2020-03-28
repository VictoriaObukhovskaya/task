package Lesson6;

public class Main {

    public static void main(String[] args) {

        Time Interval1 = new Time(3, 1, 0);
        Time Interval2 = new Time(14, 1, 0);

        int symInterval = Interval1.getsecond()+ Interval2.getsecond();
        int Difference = Interval1.getsecond()- Interval2.getsecond();
        System.out.println("Секунды1 " + Interval1.getsecond());
        System.out.println("Секунды2 " + Interval2.getsecond());
        System.out.println("Минуты1 " + Interval1.getminute());
        System.out.println("Минуты2 " + Interval2.getminute());
        System.out.println("Часы1 " + Interval1.gethour());
        System.out.println("Часы2 " + Interval1.gethour());
        System.out.println("Сумма секунд " + symInterval);
        System.out.println("Разность секунд " + Difference);
        if (Interval1.getsecond() == Interval2.getsecond()) {
            System.out.println("объекты равны");
        } else if (Interval1.getsecond() < Interval2.getsecond()) {
            System.out.println("объект 1 меньше объекта 2");
        } else if (Interval1.getsecond() > Interval2.getsecond()) {
            System.out.println("объект 2 меньше объекта 1");
        }
    }
}