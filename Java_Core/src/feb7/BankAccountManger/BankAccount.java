package feb7.BankAccountManger;

public class BankAccount {

    protected String acountNumber;
    protected String accountHolderName;
    protected double balance;

    public String getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        this.acountNumber = acountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Your current bal is: "+balance);


    }

    public void withdraw(double amount){

        if(balance-amount < 0){
            System.out.println("Your requested withdraw amount is greater than the balance");
        }
        else{
            balance -= amount;
            System.out.println("Amount "+ amount+" was successsfully withdrawn from your account");
        }


        System.out.println("Your current bal is: "+balance);
    }

    public void checkBalance(){
        System.out.println("Current Balance in the account is : "+ this.balance);
    }

}
