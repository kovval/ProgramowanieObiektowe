package Account;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void getCheckAccountnameandId() {
        Account acount = new Account("54321", "kontoPierwsze");
        Assert.assertEquals("54321", acount.getID());
        Assert.assertEquals("kontoPierwsze", acount.getName());
    }
    @Test
    public void getCheckAccountnameIdAndBalance() {
        Account acount = new Account("54321", "kontoPierwsze", 120000);
        Assert.assertEquals("54321", acount.getID());
        Assert.assertEquals("kontoPierwsze", acount.getName());
        Assert.assertEquals(120000, acount.getBalance());
    }
    @Test
    public void getCheckdebidwhenamontIsLoverThenBalance() {
        Account acount = new Account("54321", "kontoPierwsze", 120000);
        Assert.assertEquals(110000, acount.debit(10000));

    }
    @Test
    public void getCheckdebidwhenamontIsHigherThenAccountBalance() {
        Account acount = new Account("54321", "kontoPierwsze", 100);
        Assert.assertEquals(100, acount.debit(10000));
    }
    @Test
    public void checkTransferToAnotheracount() {
        Account acount = new Account("54321", "kontoPierwsze", 120000);
        Account account2 = new Account("12345", "kontoDrugie", 100);
        acount.transferTo(10000, account2);
        Assert.assertEquals(10100 ,account2.getBalance());
    }
    @Test
    public void checkTransferToAnotheracountWhenAccounthasToLovverBalance() {
        Account acount = new Account("54321", "kontoPierwsze", 120000);
        Account account2 = new Account("12345", "kontoDrugie", 100);
        account2.transferTo(10000, acount);
        Assert.assertEquals(120000 ,acount.getBalance());
    }

    @Test
    public void CheckTestToStringForAccount1AndAccount2() {
        Account acount = new Account("54321", "kontoPierwsze", 120000);
        Account account2 = new Account("12345", "kontoDrugie", 100);
        Assert.assertEquals("Account[id = 54321, name =kontoPierwsze, balance=120000]", acount.toString());
        Assert.assertEquals("Account[id = 12345, name =kontoDrugie, balance=100]", account2.toString());

    }


}
