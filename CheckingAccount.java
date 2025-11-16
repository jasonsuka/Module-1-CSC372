public class CheckingAccount extends BankAccount {

    private double interestRate;  // Example: 0.02 for 2%

    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public void processWithdrawal(double amount) {
        final double FEE = 30.0;

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }

        double newBalance = getBalance() - amount;

        if (newBalance < 0) {
            newBalance -= FEE;
            System.out.println("Overdraft! A $30 fee has been charged.");
        }

        // Adjust balance safely using superclass withdrawal()
        double difference = newBalance - getBalance();
        super.withdrawal(-difference); // convert negative difference to positive withdrawal

        System.out.printf("New balance after overdraft processing: $%.2f%n", getBalance());
    }

    public void displayAccount() {
        accountSummary();
        System.out.printf("Interest Rate : %.2f%%%n", interestRate * 100);
        System.out.println();
    }
}
