public class BankAccountTest {

    public static void main(String[] args) {

        CheckingAccount checking = new CheckingAccount("Jason", "Suka", 12345, 0.015);

        System.out.println("=== Initial Account State ===");
        checking.displayAccount();

        System.out.println("=== Test 1: Deposit $500 ===");
        checking.deposit(500);
        checking.displayAccount();

        System.out.println("=== Test 2: Withdraw $100 (no overdraft) ===");
        checking.withdrawal(100);
        checking.displayAccount();

        System.out.println("=== Test 3: Overdraft withdrawal of $500 ===");
        checking.processWithdrawal(500);   // Should trigger fee
        checking.displayAccount();
    }
}
