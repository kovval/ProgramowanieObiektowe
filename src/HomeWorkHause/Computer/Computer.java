package HomeWorkHause.Computer;

public class Computer {
    private String _manufacturer;
    private String _model;
    private String _pricesorModel;
    private String _mainBoardModel;
    private float _amountOfRam = 8.0f;
    private boolean _hasOperatingSystem = false;
    private boolean _hasSSD = false;

    public Computer(String manufacturer, String model, String pricesorModel, String mainBoardModel) {
        _manufacturer = manufacturer;
        _model = model;
        _pricesorModel = pricesorModel;
        _mainBoardModel = mainBoardModel;
    }

    public Computer(String manufacturer, String model, String pricesorModel, String mainBoardModel, float amountOfRam, Boolean hasOperatingSystem, boolean hasSSD) {
        _manufacturer = manufacturer;
        _model = model;
        _pricesorModel = pricesorModel;
        _mainBoardModel = mainBoardModel;
        _amountOfRam = amountOfRam;
        _hasOperatingSystem = hasOperatingSystem;
        _hasSSD = hasSSD;
    }
    public String getManufacturerAndModel(){
        return String.format("Computer[producer = %s, model = %s]", _manufacturer, _model);
    }
    public String getProcessorModel(){
        return _pricesorModel;
    }
    public String getMainBoardModel() {
        return  _mainBoardModel;
    }
    public float getAmoundOfRam(){
        return _amountOfRam;
    }
    public void setAmoundOfRam(float amounfOfRam){
        _amountOfRam = amounfOfRam;
    }
    public void installWindows(){
        System.out.print("System Windows is allredy instaled");
        _hasOperatingSystem = true;
    }
    public void uninstallWindows(){
        System.out.print("System Windows is uninstaled");
        _hasOperatingSystem = false;
    }

    public Boolean hasOperatingSystem() {
       return  _hasOperatingSystem;
    }
    public String hasOperatingSys() {
        return hasOperatingSystem() != false ? String.format("Windows 7") : String.format("Without system");
    }
    public void mountSSD(){
        System.out.println("SSD mounted");
        _hasSSD = true;
    }
    public void unmountSSD(){
        System.out.println("SSD unmounted");
        _hasSSD = false;
    }
    private String hasSSD() {
        return _hasSSD != false ? String.format("SSD mount") : String.format("unmount");
    }

    public String toString(){
        return String.format("computer[producer = %s, processor = %s. mainBoard = %s ram = %s, %s, %s",
                getManufacturerAndModel(),
                getProcessorModel(),
                getMainBoardModel(),
                getAmoundOfRam(),
                hasOperatingSys(),
                hasSSD());
    }
}
