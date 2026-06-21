package lab10;

import java.util.*;

public class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Customer c1 = new Customer(1, "ali");
        Customer c2 = new Customer(2, "sara");
        Customer c3 = new Customer(3, "ahmad");
        Customer c4 = new Customer(4, "lina");
        /////////////////////////////////////////
        BankAccount a1 = new BankAccount("1001", 1500, c1);
        BankAccount a2 = new BankAccount("1002", 2000, c2);
        BankAccount a3 = new BankAccount("1003", 3000, c3);
        BankAccount a4 = new BankAccount("1004", 2500, c4);
        /////////////////////////////////////////
        Bank b1 = new Bank("arab bank");
        Bank b2 = new Bank("palestine bank");
        ////////////////////////////////////////
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        b2.addAccount(a4);
        //////////////////////////////////////
        transfareMony(a3, a1, 700);
        /////////////////////////////////////
        System.out.println("bank with most costomer ");
        System.out.println(Mostcostmer(new Bank[]{b1, b2}).getBankname());
    
searchCostemor(new BankAccount[]{a1,a2,a3,a4}, "lara");
    /////////////////////////////////////
       
    }
    
    public static void transfareMony(BankAccount from, BankAccount to, double amount) {
        if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("TransefareMony has been Done Successfuly from " + from.getAccountNumber() + " to " + to.getAccountNumber());
        } else {
            System.out.println("TransefareMony failed");
        }
    }

    public static Bank Mostcostmer(Bank[] arr) {
        int max = 0;
        int maxindx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getNumberOfAccount() > max) {
                max = arr[i].getNumberOfAccount();
                maxindx = i;
            }
        }
        return arr[maxindx];
    }

    public static double totalBAlance(BankAccount[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].getBalance();
        }
        return total;
    }

    public static void searchCostemor(BankAccount[] arr, String costemorNAme) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getOwner().getCoustemername().equals(costemorNAme)) {
                System.out.println(arr[i]);
                found = true;
                break;
            }

        }
        if (found == false) {
            System.out.println("coustemer not found");
        }
    }
}
