package feb7.BankAccountManger;

public class CheckingAccount extends BankAccount{

    protected double transactionFee = 11;
    @Override
    public void withdraw(double amount){

        amount+=transactionFee;
        if (balance - amount < 0){
            System.out.println("requested amount: "+ amount+" is > checkings account balance: "+balance);
            System.out.println("Your current Chekings Balance is: "+balance);
        }else{
            balance -= amount;
            System.out.println("Your current Chekings Balance after withdrawing: "+amount+" is: "+balance);
        }


    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Your current checkings account bal after depositing: "+amount+" is: "+balance);


    }

}
