package HomeWorkHause.ATM;

public class ATM {
    private int _id;
    private String _bankName;
    private String _street;
    private String _buildingNumber;
    private int _cash;
    private int _cashLimit = 15000;
    private boolean isWorking = true;

    public ATM(int id, String bankName, String stret, String buildingNumber, int cash, int cashLimit ) {
        _id = id;
        _bankName = bankName;
        _buildingNumber = buildingNumber;
        _cash = cash;
        _cashLimit = cashLimit;
    }
    public ATM(int id, String bankName, String stret, String buildingNumber, int cash) {
        _id = id;
        _bankName = bankName;
        _buildingNumber = buildingNumber;
        _cash = cash;

    }
    public ATM(int id, String bankName, String stret, String buildingNumber ) {
        _id = id;
        _bankName = bankName;
        _buildingNumber = buildingNumber;
    }



}
