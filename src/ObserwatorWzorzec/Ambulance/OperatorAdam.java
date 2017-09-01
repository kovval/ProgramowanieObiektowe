package ObserwatorWzorzec.Ambulance;

import java.util.ArrayList;
import java.util.List;

public class OperatorAdam implements IOperator{
    List<IAmbulance> ambulances = new ArrayList<>();
    private String status = "";


    @Override
    public void registerObserver(IAmbulance ambulance) {
        ambulances.add(ambulance);

    }

    @Override
    public void removeObserver(IAmbulance ambulance) {
        ambulances.remove(ambulance);

    }

    @Override
    public void notifyObservers() {
        for(IAmbulance ambulance : ambulances) {
            ambulance.update();
        }

    }
    @Override
    public String getStatus(){
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

}
