package at.fda.bankOO.accounts;

public class CheckAccount extends MainAccount {

    private double withdrawLimit = 0;
    public CheckAccount(String accountID, String owner) {

        super(accountID, owner);
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void withdrawMoney(double withdraw) {
        if (withdraw < withdrawLimit)
        {
            super.withdrawMoney(withdraw);
        }
        else
        {
            System.out.println("Sie dürfen nicht so viel abheben!");
        }
    }
}