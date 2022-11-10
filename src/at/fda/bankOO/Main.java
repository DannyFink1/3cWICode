package at.fda.bankOO;
import java.util.UUID;

public class Main {

public static void main(String[] args){
    String uuid = UUID.randomUUID().toString();
    MainAccount mainAccount = new MainAccount(uuid, "Daniel");
    SavingsAccount savingsAccount = new SavingsAccount(uuid, "Daniel");

    savingsAccount.depositMoney(100);
    savingsAccount.checkBalance();
    savingsAccount.setInterest(100);
    savingsAccount.addInterestToBalance();
    savingsAccount.checkBalance();

    CheckAccount checkAccount = new CheckAccount(uuid, "Daniel");
    checkAccount.depositMoney(1300);
    checkAccount.openCredit(20000);
    checkAccount.withdraw(21000);

}

}
