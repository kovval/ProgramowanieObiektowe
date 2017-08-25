package Powtorzenie;

/**
 * Created by RENT on 2017-08-25.
 */


public class MyTime {
    private int _hour = 0;
    private int _minut = 0;
    private int _second = 0;


    public MyTime() {
    }

    public MyTime(int hour,  int minut, int second) {
        if (hour < 0 || hour > 23 || minut < 0 || minut > 59 || second < 0 || second > 59){
            throw new IllegalArgumentException("błędne dane");
        }
        _hour = hour;
        _minut = minut;
        _second = second;
    }

    public void setTime(int hour,  int minut, int second) {
        if (hour < 0 || hour > 23 || minut < 0 || minut > 59 || second < 0 || second > 59){
            throw new IllegalArgumentException("błędne dane");
        }
        setHour(hour);
        setMinut(minut);
        setSecond(second);
    }

    public int getHour() {
        return _hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("bledna godzina");
        }
        _hour = hour;
    }

    public int getMinut() {
        return _minut;
    }

    public void setMinut(int minut) {
        _minut = minut;
    }

    public int getSecond() {
        return _second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("bledna sekunda");
        }
        _second = second;
    }


    public String toString() {
        return String.format("%2.0d:%2.0d,%2.0d", getHour(), getMinut(), getSecond());
    }


    public MyTime nextSecond(int nextSecond) {
        return nextSecond((getSecond() + 1) % 60);
    }

    public MyTime nextMinute(int nextMinut) {
        return nextSecond((getMinut() + 1) % 60);
    }

    public MyTime nextHour(int nextHour) {
        return nextSecond((getHour() + 1) % 23);
    }

    public MyTime previousHour(int previousHour) {
        return nextSecond((getHour() - 1) % 23);
    }

    public MyTime previousMinute(int previousMinut) {
        return nextSecond((getMinut() - 1) % 60);
    }

    public MyTime previousSecond(int previousSecond) {
        return nextSecond((getSecond() - 1) % 60);
    }


}
