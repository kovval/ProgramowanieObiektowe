package Time;

public class Time {
    private int _hour;
    private int _minute;
    private int _second;

    public Time(int hour, int minute, int second){
        _hour = hour;
        _minute = minute;
        _second = second;

    }
    public int getHour() {
        return _hour;
    }

    public void setHour(int hour) {
        this._hour = hour;
    }

    public int getMinute() {
        return _minute;
    }

    public void setMinute(int minute) {
        this._minute = minute;
    }

    public int getSecond() {
        return _second;
    }

    public void setSecond(int second) {
        this._second = second;
    }

    public String toString() {
        return _hour+":"+_minute+":"+_second;
    }

    public int nextSeccond(){
        return _second+1;
    }

    public int previousSeccond(){
        return _second-1;
    }

}
