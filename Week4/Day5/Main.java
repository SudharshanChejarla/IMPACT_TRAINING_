// create a java code for class BankAccount(seposit,withdraw) and sub class savingsAccnt that overrides withdraw method to prevent the withdrawls if account balance is below 100  

package Week4.Day5;

class BankAccount {
    int balance = 0 ;
    void deposit(int x) {
        
        balance += x ;
        System.out.println(x+"rs Deposited");
    }
    void withdraw(int x) {
        balance -= x ;
    }
}

class SavingsAccount extends BankAccount {

    @Override
    void withdraw(int x) {
        if(balance < 100) {
            System.out.println("Can't Withdraw Money(balance less than 100rs)");
        } else if(balance >= x){
            balance -= x ;
            System.out.println(x+"rs amount withdrawn");
        } else {
            System.out.println("Withdrawl amount is greater than available balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount();
        account.deposit(90);
        account.withdraw(70);
        account.deposit(900);
        account.withdraw(80000);
    }
}
