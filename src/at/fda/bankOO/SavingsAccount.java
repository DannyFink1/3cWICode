package at.fda.bankOO;

public class SavingsAccount extends MainAccount {


    private int interest = 0;

    public SavingsAccount(String accountID, String owner) {
        super(accountID, owner);
    }

    public void addInterestToBalance()
    {
        setBalance(getBalance() + getBalance()/100*interest);
        System.out.println("Zinsen wurden hinzugefügt! \n   neuer Kontostand: " + getBalance() + "€");
    }
    public int getInterest() {

        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
        System.out.println("Zinssatz wurde aktualisiert!");
    }
}
