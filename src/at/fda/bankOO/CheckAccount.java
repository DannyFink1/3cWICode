package at.fda.bankOO;

public class CheckAccount extends MainAccount {


    private double credit;

    public CheckAccount(String accountID, String owner) {
        super(accountID, owner);
    }

    //Override
    public void withdraw(double withdraw)
    {
        if(withdraw <= getBalance() + credit) {
            setBalance(getBalance()-withdraw);
            System.out.println("Geld wurde abgehoben! \n    neuer Kontostand: " + getBalance() + "€");
        }else
            System.out.println("Sie können nicht so viel abheben!");
    }

    public double getCredit() {
        return credit;
    }

    public void openCredit(double credit) {
        this.credit = credit;
    }
}