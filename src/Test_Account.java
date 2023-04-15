import java.util.Scanner;

class Account{
    String name;
    int ac_No;
    float amount;

    //Set information of the account holder.
    void information(String n, int a, float amt){
        name = n;
        ac_No = a;
        amount = amt;
    }
    //Set Deposit information.

    void deposit(float amt){
        amount = amount + amt;
        System.out.println("Deposited : " +amt);
    }

    //Set withdrawn information.

    void withdrawn (float amt){
        if (amount < amt){
            System.out.println("The balance is insufficient");
        }else{
            amount = amount - amt;
            System.out.println("Withdrawn : "+amt);
        }
    }
    void displayInformation(){
        System.out.println("The information of the Ac holder: ");
        System.out.println("Name: " +name + ", Account No: " +ac_No);
    }
    void checkBalance(){
        System.out.println("Total balance is: "+amount);
    }
}

public class Test_Account {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.information("Rifad Ahmed", 1415163, 1200);
        a1.displayInformation();
        a1.checkBalance();
        a1.deposit(300);
        a1.checkBalance();
        a1.withdrawn(600);
        a1.checkBalance();
        System.out.println();

        Account a2 = new Account();
        a2.information("Mridul", 1417195, 1500);
        a2.displayInformation();
        a2.checkBalance();
        a2.deposit(500);
        a2.checkBalance();
        a2.withdrawn(600);
        a2.checkBalance();
    }
}