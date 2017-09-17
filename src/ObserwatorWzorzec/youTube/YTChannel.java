package ObserwatorWzorzec.youTube;

import java.util.ArrayList;
import java.util.Observer;

public class YTChannel implements ISubject {
    private ArrayList<IObserver> observerList;

    public  YTChannel() {
        observerList = new ArrayList<>();
    }

    public void publishNewVideo(){
        System.out.println("YTChannel: Publisching new video.");
        notifyObservers();
    }

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : observerList){
            o.update();
        }
    }
}


