package at.fda.bankOO;

public class MainAccount {
    private String accountID;
    private String owner;
    private double balance;

    public MainAccount(String accountID, String owner) {
        this.accountID = accountID;
        this.owner = owner;
    }

    public String getAccountID() {
        return accountID;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }



    public void depositMoney(double deposit)
    {
        this.balance += deposit;
    }

    public void withdrawMoney(double withdraw)
    {
        if(withdraw < this.balance)
            this.balance -= withdraw;
        else
            System.out.println("Sie können nicht so viel abheben!");
    }
}
