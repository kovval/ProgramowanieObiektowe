package Employee;

public class Employee {
    private int _id;
    private String _firstName;
    private String _lastName;
    private int _salary;



    public Employee(int id, String firstName, String lastName, int salary){
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
        _salary = salary;
    }
    public int getID() {
        return _id;
    }
    public String getFirstName() {
        return _firstName;
    }
    public String getLastName() {
        return _lastName;
    }
    public String getName(){
        return _firstName+" "+_lastName;
    }
    public int getSalary() {
        return _salary;
    }
    public void setSalary(int salary) {
        _salary = salary;
    }
    public int getAnnualSallary(){
        return _salary*12;
    }
    public int raiseSalary(int procent){
        _salary = (_salary*(100+procent)/100);
        return _salary;
    }
    public String toString(){
        return "Employee[id="+_id+" name= "+getName()+" , salary =" +_salary+"]";
    }

}
