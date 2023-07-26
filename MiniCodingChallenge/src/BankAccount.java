public abstract class BankAccount {
    private int interestRate;
    private String name;
    protected double balance;
    private int accountNumber;


    public BankAccount(int interestRate, String name, double balance, int accountNumber) {
        this.interestRate = interestRate;
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "interestRate=" + interestRate +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    public abstract double deposit(double x);
    public abstract double withdraw(double y);
    public abstract void displayBalance();
}
