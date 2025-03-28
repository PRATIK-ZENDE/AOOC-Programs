class BankAccount {
    private int balance;
    public BankAccount(int initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance 0.");
        }
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(int initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(int amount) {
        if (getBalance() - amount >= 100) {
            super.withdraw(amount); 
        } else {
            System.out.println("Balance is under 100.");
        }
    }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500);
        SavingsAccount savingsAccount = new SavingsAccount(500);

        bankAccount.deposit(200);
        bankAccount.withdraw(150);
        System.out.println("BankAccount Balance: " + bankAccount.getBalance());

        savingsAccount.deposit(200);
        savingsAccount.withdraw(350);  
        savingsAccount.withdraw(600);  
        savingsAccount.withdraw(500);  
        System.out.println("SavingsAccount Balance: " + savingsAccount.getBalance());
	}
}