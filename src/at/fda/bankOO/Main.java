package at.fda.bankOO;
import java.util.UUID;

public class Main {

public static void main(String[] args){
    String uuid = UUID.randomUUID().toString();

    //Test-area
    SavingsAccount savingsAccount = new SavingsAccount(uuid, "Daniel");
    savingsAccount.depositMoney(100);
    savingsAccount.setInterest(20);
    savingsAccount.addInterestToBalance();

    System.out.println("\n\n\n\n\n");

    CheckAccount checkAccount = new CheckAccount(uuid,"Daniel");
    checkAccount.openCredit(10000);
    System.out.println(checkAccount.getBalance());
    checkAccount.setBalance(3000);
    System.out.println(checkAccount.getBalance());
    checkAccount.withdrawMoney(10000);
    checkAccount.withdrawMoney(2000);
    checkAccount.withdrawMoney(10000);



}

}
