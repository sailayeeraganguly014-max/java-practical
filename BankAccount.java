class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (balance>=amount) 
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }
    void displayBalance() {
        System.out.println("Account No: " +accountNumber);
        System.out.println("Balance: " +balance);
    }
    class SavingsAccount extends BankAccount {
        double interestRate;
        SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }
        void calculateInterest() {
            double interest = balance * interestRate / 100;
            System.out.println("Interest: " +interest);
        }
        void addInterest() {
            balance+=balance * interestRate / 100;
        }
    }
    class FixedDepositAccount extends BankAccount {
        int maturityPeriod;
        FixedDepositAccount(String accountNumber, double balance, double interestRate,int maturityPeriod) {
            super(accountNumber, balance);
            this.maturityPeriod = maturityPeriod;
        }
        void calculateMaturityAmount() {
            double maturityAmount = balance+ (balance * interestRate * maturityPeriod/ 100 );
            System.out.println("Maturity Amount: " +maturityAmount);
        }
    }
    public class Main(){
        public static void main(String[] args) {
            FixedDepositAccount obj=new FixedDepositAccount("A101,10000,5,12");
            obj.deposit(2000);
            obj.addInterest();
            obj.calculateMaturityAmount();
 }
}
    
}
