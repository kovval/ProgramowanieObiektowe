package Employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void getIDtest(){
        Employee emp = new Employee(12, "Jan", "Kovval", 200);
        Assert.assertEquals(12, emp.getID());
    }

@Test
public void testgetIDFirstNameLastNAmeAndSalary(){
    Employee emp = new Employee(12, "Jan", "Kovval", 200);
    Assert.assertEquals("Jan Kovval" ,emp.getName());
}
@Test
public void testGetFirstNameForSameDateLikeMyTestBefore(){
    Employee emp = new Employee(12, "Jan", "Kovval", 200);
    Assert.assertEquals("Jan", emp.getFirstName());
}
@Test
    public void testGetLastNameForSameDateLikeMyTestBefore(){
        Employee emp = new Employee(12, "Jan", "Kovval", 200);
        Assert.assertEquals("Kovval", emp.getLastName());
    }
    @Test
    public void testgetSalaryForSameDateLikeBeforeAndGiveMeSomeEngLessonsForCreagingMorePracticTextMassageInTesting(){
        Employee emp = new Employee(12, "Jan", "Kovval", 200);
        Assert.assertEquals(200, emp.getSalary());
    }
    @Test
    public void TestsetSallaryForDate2000(){
        Employee emp = new Employee(12, "Jan", "Kovval", 200);
        emp.setSalary(2000);
        Assert.assertEquals(2000, emp.getSalary());
    }
    @Test
    public void TestsetAnnualSallaryForDate2000(){
        Employee emp = new Employee(12, "Jan", "Kovval", 200);
        Assert.assertEquals(2400, emp.getAnnualSallary());
    }
    @Test
    public void raiseSalaryBy35Procent() {
        Employee emp = new Employee(12, "Jan", "Kovval", 200);
        emp.raiseSalary(50);
        Assert.assertEquals(300, emp.getSalary());
    }

    @Test
    public void TestEmployeehasID() {
        Employee employe = new Employee(12, "Jan", "Kovval", 200);
        Assert.assertEquals("Employee[id=12 name= Jan Kovval , salary =200]", employe.toString());

}
}
