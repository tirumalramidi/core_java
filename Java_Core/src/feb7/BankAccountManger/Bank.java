package feb7.BankAccountManger;

public class Bank {

    public static void main(String args[]){


        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountHolderName("Ravii");
        savingsAccount.setAcountNumber("12345");

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountHolderName("Sahil");
        checkingAccount.setAcountNumber("6789");

        savingsAccount.setBalance(1000);
        checkingAccount.setBalance(5000);


        savingsAccount.checkBalance();
        checkingAccount.checkBalance();
        System.out.println();

        savingsAccount.withdraw(600);
        checkingAccount.withdraw(5500);
        System.out.println();

        savingsAccount.deposit(10000);
        savingsAccount.checkBalance();
        checkingAccount.deposit(55555);
        checkingAccount.checkBalance();
        System.out.println();

        savingsAccount.withdraw(111);
        checkingAccount.withdraw(999);
        System.out.println();



    }

}
