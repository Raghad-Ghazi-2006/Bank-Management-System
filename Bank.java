package lab10;

import java.util.Arrays;

public class Bank {

    private String bankname;
    private BankAccount[] accounts=new BankAccount [1] ;
    private int numberOfAccount;

    public Bank() {
    }

    public Bank(String bankname, BankAccount[] accounts, int numberOfAccount) {
        this.bankname = bankname;
        this.accounts = accounts;
        this.numberOfAccount = numberOfAccount;
    }

    public Bank(String bankname) {
        this.bankname = bankname;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public void setAccounts(BankAccount[] accounts) {
        this.accounts = accounts;
    }

    public int getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(int numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public void addAccount(BankAccount acc) {
        boolean flag = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = acc;
                System.out.println("account added");
                flag = true;
                 numberOfAccount++;
                break;
            }
        }
        if (flag == false) {
            BankAccount[] bibAccount = new BankAccount[accounts.length + 1];
            int i = 0;
            for (i = 0; i < accounts.length; i++) {
                bibAccount[i] = accounts[i];
            }
            bibAccount[i] = acc;
             numberOfAccount++;
             System.out.println("account added");
        }

    }

    @Override
    public String toString() {
        return "Bank{" + "bankname=" + bankname + ", accounts=" + Arrays.toString(accounts) + ", numberOfAccount=" + numberOfAccount + '}';
    }

}
