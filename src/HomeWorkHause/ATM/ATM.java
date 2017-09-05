package HomeWorkHause.ATM;

public class ATM {
    private int _id;
    private String _bankName;
    private String _street;
    private String _buildingNumber;
    private int _cash;
    private int _cashLimit = 15000;
    private boolean isWorking = true;

    public ATM(int id, String bankName, String stret, String buildingNumber, int cash, int cashLimit) {
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

    public ATM(int id, String bankName, String stret, String buildingNumber) {
        _id = id;
        _bankName = bankName;
        _buildingNumber = buildingNumber;
    }

    public int getId() {
        return _id;
    }

    public String getBankName() {
        return _bankName;
    }

    public String getATMDetails() {
        return String.format("ATM[id = %d, bankName = %s, buildingNumber = %s",
                getId(), getBankName(), getBankName());
    }

    public void depositCash(int amount) {
        _cash -= amount;
    }

    public void withdrawMoney(int amount) {
        _cash += amount;
    }

    public int getCash(int cashToDeposit) {
        depositCash(cashToDeposit);
        return cashToDeposit;
    }

    private int getCashLimit(){
        return _cashLimit;
    }
    private boolean checkIfCanDoOperation(int cash){
        if ((_cash + cash) < (_cashLimit-cash) || (_cash - cash > 0))
        { return true;
        }
        return false;
    }
    public String checkStatus() {
        if(isWorking) System.out.println("All working correctly");
        if (_cash == _cashLimit ) return String.format("ATM is overFilled");
        if (_cash == 0) return  String.format("ATM is empty");
        return ".";
    }
    public toString


}
