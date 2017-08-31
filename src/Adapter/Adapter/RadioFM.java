package Adapter.Adapter;

import java.util.Random;

/**
 * Created by RENT on 2017-08-31.
 */
public class RadioFM implements IAnalogSignal {

        Random rd = new Random();
        double[] sygnal = rd.doubles(8, 0.0, 2.0).toArray();





    @Override
    public double[] getAnalog() {
       return null;
    }

    @Override
    public void setAnalog(double[] analogData) {

    }

    @Override
    public void printanalog() {

    }
}
