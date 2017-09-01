package ObserwatorWzorzec.Ambulance;

public class SecondAmbulance implements IAmbulance{


    private IOperator operator;

    public SecondAmbulance(IOperator operator) {
        this.operator = operator;
        operator.registerObserver(SecondAmbulance.this);
    }

    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident(){
        System.out.println(SecondAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
