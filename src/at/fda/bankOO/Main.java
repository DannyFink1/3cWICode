package at.fda.bankOO;

import at.fda.bankOO.accounts.*;

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

    CreditAccount creditAccount = new CreditAccount(uuid, "Daniel");
    creditAccount.depositMoney(1300);
    creditAccount.openCredit(20000);
    creditAccount.withdrawMoney(21000);

    CheckAccount checkAccount = new CheckAccount(uuid, "Daniel");
    checkAccount.setWithdrawLimit(200);
    checkAccount.depositMoney(1000);
    checkAccount.withdrawMoney(220);

    LaendleCheckAccount laendleCheckAccount = new LaendleCheckAccount(uuid, "Daniel");
    laendleCheckAccount.setWithdrawLimit(1000);
    laendleCheckAccount.depositMoney(212234);
    laendleCheckAccount.withdrawMoney(12002);
    laendleCheckAccount.checkLaendleDetails();


}

}

