package Account;

import javax.security.auth.login.AccountLockedException;
import java.util.List;

public class Account {
    private String _id;
    private String _name;
    private int _balance = 0;

    public Account(String id, String name){
        _id = id;
        _name = name;
    }



    public Account(String id, String name, int balance) {

        _id = id;
        _name = name;
        _balance = balance;

    }
    public String getID() {
        return _id;
    }


    public String getName() {
        return _name;
    }

    public int getBalance() {
        return _balance;
    }
    public int credit(int amount){
        _balance = amount+_balance;
        return _balance;
    }
    public int debit(int amount){
        if(amount <= _balance){
            _balance = _balance-amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return _balance;
    }

    public int transferTo(int amount, Account another) {

        if (amount <= _balance) {
            another._balance = another._balance+amount;
            debit(amount);
        } else {
            System.out.println("amount exceeded balance");
        }
        return amount;
    }

    public String toString() {
        return "Account[id = "+_id +", name ="+_name+", balance=" + _balance+"]";
    }


}
