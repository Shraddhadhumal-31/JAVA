class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {

  
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    
    @Override
    public void withdraw(double amount) 
       {
        if (amount > 0 && (balance - amount) >= 100) 
          {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
           } else 
          {
            System.out.println("Withdrawal denied. Minimum balance of $100 must be maintained.");
         }
       }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500);

        myAccount.displayBalance(); 
        myAccount.deposit(200); 
        myAccount.displayBalance();

        myAccount.withdraw(550); 
        myAccount.displayBalance();

        myAccount.withdraw(350);
        myAccount.displayBalance();
    }
}
