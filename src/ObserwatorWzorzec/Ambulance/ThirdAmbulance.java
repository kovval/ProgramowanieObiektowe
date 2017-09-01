package ObserwatorWzorzec.Ambulance;

public class ThirdAmbulance implements IAmbulance{
    private IOperator operator;

    public ThirdAmbulance(IOperator operator){
        this.operator = operator;
        operator.registerObserver(ThirdAmbulance.this);
    }


    @Override
    public void update() {
        driveToIncident();
    }

    private void driveToIncident() {
        System.out.println(ThirdAmbulance.class.getSimpleName() + " received a notification and is driving to incident right now!");
        System.out.println("Incident: " + operator.getStatus());
    }
}
