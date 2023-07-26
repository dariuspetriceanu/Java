public class Business extends BankAccount implements SpecialFeatures{
    private int loanAmount = 0;
    public Business(int interestRate, String name, double balance, int accountNumber, int loanAmount) {
        super(interestRate, name, balance, accountNumber);
        this.loanAmount = loanAmount;
    }
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

    @Override
    public void loanApplication() {
        if(this.balance*10>this.loanAmount){
            System.out.println("You get a loan! :)");
        }else {
            System.out.println("You've been rejected! :(");
        }
    }
}
