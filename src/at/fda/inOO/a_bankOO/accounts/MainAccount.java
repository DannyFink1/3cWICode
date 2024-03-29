package at.fda.a_bankOO.accounts;

public class MainAccount {
    private String accountID;
    private String owner;
    private double balance;

    public MainAccount(String accountID, String owner) {
        this.accountID = accountID;
        this.owner = owner;
    }

    public String getAccountID() {
        System.out.println(accountID);
        return accountID;
    }

    public String getOwner() {
        System.out.println(owner);
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
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

    public void checkBalance()
    {
        System.out.println("Kontostand beträgt: " + this.balance + "€");
    }
}

