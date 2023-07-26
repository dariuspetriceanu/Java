public class Saver extends BankAccount{

    public Saver(int interestRate, String name, double balance, int accountNumber) {
        super(interestRate, name, balance, accountNumber);
    }

    @Override
    public double deposit(double x) {
        this.balance = this.getBalance() + x;
        return this.getBalance()+x;
    }

    @Override
    public double withdraw(double y) {
        this.balance = this.getBalance() - y;
        return this.getBalance() - y;
    }

    @Override
    public void displayBalance() {
        System.out.println(this.getBalance());
    }
}
