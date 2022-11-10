package at.fda.bankOO.accounts;

public class LaendleCheckAccount extends CheckAccount {

    public LaendleCheckAccount(String accountID, String owner) {

        super(accountID, owner);
    }

    public void checkLaendleDetails()
    {
        System.out.println("Hallo, ich bin ein Ländlegirokonto, ich bin eigentlich nur ein CheckAccount :D");
    }


}
