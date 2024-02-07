package feb7.BankAccountManger;

public class SavingsAccount extends BankAccount{

    private double minBalance;
    public SavingsAccount() {
        minBalance = 500;
    }

    @Override
    public void withdraw(double amount){

        if (balance - amount < minBalance){
            System.out.println("If requested amount: "+ amount+" is processed" +
                    " Your savings account balance(before withdraw): "+balance +" would be less than the minBal: "+minBalance);

            System.out.println("Your Savings Account balance is: "+balance);
        }else{
            balance -= amount;
            System.out.println("Your current savings Account Balance after withdrawing: "+amount+" is: "+balance);
        }




    }

    @Override
    public void deposit(double amount){
        balance += amount;
        System.out.println("Your current savings account bal after depositing: "+amount+" is: "+balance);


    }

}
