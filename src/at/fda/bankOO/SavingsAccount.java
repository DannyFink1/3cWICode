package at.fda.bankOO;

public class SavingsAccount extends MainAccount {


    private int interest = 0;

    public SavingsAccount(String accountID, String owner) {

        super(accountID, owner);
    }

    public void addInterestToBalance()
    {
        setBalance(getBalance() + getBalance()*interest/100);

    }
    public int getInterest() {

        return interest;
    }

    public void setInterest(int interest) {

        this.interest = interest;
    }
}
