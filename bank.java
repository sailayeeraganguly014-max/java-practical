import java.util.*;


interface Bank {
    void setBank(String bankName);
    void showBank();
}

class Customer {
    String custName;

    void setCustomer(String name) {
        custName = name;
    }

    void showCustomer() {
        System.out.println("Customer Name: " + custName);
    }
}


class Account extends Customer implements Bank {
    int accNo;
    double balance;
    String bankName;

    void setAccount(int no, double bal) {
        accNo = no;
        balance = bal;
    }

    public void setBank(String name) {
        bankName = name;
    }

    public void showBank() {
        System.out.println("Bank: " + bankName);
    }

    void display() {
        showBank();
        showCustomer();
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}


class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();

        System.out.print("Enter Bank Name: ");
        a.setBank(sc.nextLine());

        System.out.print("Enter Customer Name: ");
        a.setCustomer(sc.nextLine());

        System.out.print("Enter Account No: ");
        int no = sc.nextInt();

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();

        a.setAccount(no, bal);

        System.out.println("\n--- Account Details ---");
        a.display();
    }
}
