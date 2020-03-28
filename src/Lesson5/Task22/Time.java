package Lesson6;

public class Time {
    private int second;
    private int minute;
    private int hour;
    private int AllSecond;

    Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public int AllSecond() {
        return AllSecond;
    }
    public int getAllSecond() {
        return AllSecond;
    }
    public void setAllSecond(int AllSecond) {
        this.second = AllSecond;
    }
    public int getsecond() {
        return second;
    }
    public void setsecond(int second) {
        this.second = second;
    }
    public int getminute() {
        return minute;
    }
    public void setminute(int minute) {
        this.minute = minute;
    }
    public int gethour() {
        return hour;
    }
    public void sethour(int hour) {
        this.hour = hour;
    }
    public int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }
}
