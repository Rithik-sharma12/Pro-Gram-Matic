import java.util.*;

class BankAccount{
    private int balance;
    BankAccount(int num){
        balance=num;
    }
    void deposite(int num){
        balance += num;
    }

    void withdraw(int num){
        if(balance<0){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= num;
        }
    }
    
    void checkBalance(){
        System.out.println("The Available Balance is "+balance);
    }

}

public class Bank {
    public static void main(String[] args){

        BankAccount b1 = new BankAccount(50000);
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("KCG Banking Services\n 1.Deposit\n 2.Withdraw\n 3.Check balance\n 4.Exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Deposit selected\n Enter the amount :");
                num = sc.nextInt();
                b1.deposite(num);
                b1.checkBalance();
                break;
            case 2:
                System.out.println("Withdraw selected\n Enter the amount :");
                num = sc.nextInt();
                b1.withdraw(num);
                b1.checkBalance();
                break;
            case 3:
                System.out.println("Check Balance is selected");
                b1.checkBalance();
                break;
            case 4:
                System.out.println("Exiting the bank");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

    }
}
