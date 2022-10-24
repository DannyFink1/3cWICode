package at.fda.bankOO;
import java.util.UUID;

public class Main {

public static void main(String[] args){
    String uuid = UUID.randomUUID().toString();
    MainAccount mainAccount = new MainAccount(uuid, "Daniel");
    SavingsAccount savingsAccount = new SavingsAccount(uuid, "Daniel");
    savingsAccount.addInterestToBalance();
}

}
