class Q2 {
    double balance;
    int accountNumber;

    public static void main(String[] args) {
        Q2 account = new Q2();
        account.accountNumber = 12345;
        account.balance = 1000.0;

        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Balance: $" + account.balance);
    }
}
