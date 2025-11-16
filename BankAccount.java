public class BankAccount {

    // Fields
    private String firstName;
    private String lastName;
    private int accountID;
    private double balance;

    // Constructor – balance starts at 0
    public BankAccount(String firstName, String lastName, int accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.0;
    }

    // Optional no-arg constructor if you want it
    public BankAccount() {
        this("", "", 0);
    }

    // Deposit – add to balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdrawal – subtract from balance (no overdraft logic here)
    public void withdrawal(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            balance -= amount;
        }
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    // getBalance() getter
    public double getBalance() {
        return balance;
    }

    // accountSummary() – prints all account info
    public void accountSummary() {
        System.out.println("----- Account Summary -----");
        System.out.println("Account Holder: " + firstName + " " + lastName);
        System.out.println("Account ID    : " + accountID);
        System.out.printf("Balance       : $%.2f%n", balance);
        System.out.println("----------------------------");
    }
}
