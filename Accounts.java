import java.util.Scanner;

abstract class Accounts {
    double balance;
    int accountNumber;
    String name, address;

    Accounts(int accNo, String name, String address, double balance) {
        this.accountNumber = accNo;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    abstract void withdrawl(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int accNo, String name, String address, double balance, double roi) {
        super(accNo, name, address, balance);
        this.rateOfInterest = roi;
    }

    void withdrawl(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account No, Name, Address, Balance, ROI:");
        int accNo = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String address = sc.nextLine();
        double balance = sc.nextDouble();
        double roi = sc.nextDouble();

        SavingsAccount acc = new SavingsAccount(accNo, name, address, balance, roi);

        acc.deposit(1000);
        acc.withdrawl(500);
        acc.calculateAmount();
        acc.display();

        sc.close();
    }
}
