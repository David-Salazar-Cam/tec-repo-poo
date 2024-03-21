package tec.poo.tareas;// Your First Program

class MutableBankAccount {

    private String accountNumber;
    private double balance;

    public MutableBankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double balance){
        double nbalance;
        nbalance=balance+this.balance;
        this.balance=nbalance;
    }


    public void withdraw(double balance){
        double nbalance;
        nbalance=this.balance-balance;
        this.balance=nbalance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}