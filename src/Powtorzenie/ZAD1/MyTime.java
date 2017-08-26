package Powtorzenie.ZAD1;

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
//        if (hour < 0 || hour > 23 || minut < 0 || minut > 59 || second < 0 || second > 59){
//            throw new IllegalArgumentException("Zle dane");
//        }
        setHour(hour);
        setMinut(minut);
        setSecond(second);
    }

    public void setTime(int hour,  int minut, int second) {
        if (hour < 0 || hour > 23 || minut < 0 || minut > 59 || second < 0 || second > 59){
            throw new IllegalArgumentException("Zle dane");
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
            throw new IllegalArgumentException("zla godzina");
        }
        _hour = hour;
    }

    public int getMinut() {
        return _minut;
    }

    public void setMinut(int minut) {

            if (minut < 0 || minut > 59) {
                throw new IllegalArgumentException("bledna minuta");
            }
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
        return String.format("%02d:%02d:%02d", getHour(), getMinut(), getSecond());
    }


    public MyTime nextSecond()
    {
        try {
            setTime(getHour(), getMinut(), getSecond()+1);
            return this;
        }
        catch(IllegalArgumentException e) {}

        setSecond(0);
        return nextMinute();
    }

    public MyTime nextMinute()
    {
        try {
            setTime(getHour(), getMinut()+1, getSecond());
            return this;
        }
        catch(IllegalArgumentException e) {}

        setMinut(0);
        return nextHour();
    }
    public MyTime nextHour()
    {
        try {
            setTime(getHour()+1, getMinut(), getSecond());
            return this;
        }
        catch(IllegalArgumentException e) {}

        setHour(0);
        return this;
    }

    public MyTime previousSecond()
    {
        try {
            setTime(getHour(), getMinut(), getSecond()-1);
            return this;
        }
        catch(IllegalArgumentException e) {}

        setSecond(59);
        return previousMinute();
    }

    public MyTime previousMinute()
    {
        try {
            setTime(getHour(), getMinut()-1, getSecond());
            return this;
        }
        catch(IllegalArgumentException e) {}

        setMinut(59);
        return previousHour();
    }
    public MyTime previousHour()
    {
        try {
            setTime(getHour()-1, getMinut(), getSecond());
            return this;
        }
        catch(IllegalArgumentException e) {}

        setHour(23);
        return this;
    }

}
