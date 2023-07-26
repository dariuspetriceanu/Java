public class Current extends BankAccount{
    public Current(int interestRate, String name, double balance, int accountNumber) {
        super(interestRate, name, balance, accountNumber);
    }

    @Override
    public double deposit(double x) {
        this.balance = this.getBalance() + x;
        return this.getBalance()+x;
    }

    @Override
    public double withdraw(double y) {
        if(this.balance >= y){
            this.balance = this.getBalance() - y;
            System.out.println(this.balance);
            return this.getBalance() - y;
        }
        System.out.println(this.balance);
        return this.balance;
    }

    @Override
    public void displayBalance() {
        System.out.println(this.getBalance());
    }
}
