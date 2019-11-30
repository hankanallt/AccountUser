package accountuser;

public class Account {

    private int balance;
    private String owner;
    private int accountNr;

    private static int nAccounts = 0;

    public Account(String name) {

        owner = name;
        balance = 0;
        nAccounts++;
        accountNr = nAccounts;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withDraw(int amount) {
        if (amount <= balance) {
        } else {
            System.out.println("Not Enought Money");
        }
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        return accountNr + "/" + owner + ": " + balance;
    }

    public static int getNumberOfAccounts() {
        return nAccounts;
    }

}
