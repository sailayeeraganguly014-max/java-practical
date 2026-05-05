abstract class Asset {
    String descriptor, date;
    double current_value;

    Asset(String d, String dt, double val) {
        descriptor = d;
        date = dt;
        current_value = val;
    }

    abstract void displayDetails();
}

class Stock extends Asset {
    int num_shares;
    double share_price;

    Stock(String d, String dt, double val, int n, double sp) {
        super(d, dt, val);
        num_shares = n;
        share_price = sp;
    }

    void displayDetails() {
        System.out.println("Stock " + descriptor + " " + current_value);
    }
}

class Bond extends Asset {
    double interest_rate;

    Bond(String d, String dt, double val, double r) {
        super(d, dt, val);
        interest_rate = r;
    }

    void displayDetails() {
        System.out.println("Bond " + descriptor + " " + current_value);
    }
}

class Savings extends Asset {
    double interest_rate;

    Savings(String d, String dt, double val, double r) {
        super(d, dt, val);
        interest_rate = r;
    }

    void displayDetails() {
        System.out.println("Savings " + descriptor + " " + current_value);
    }

    public static void main(String[] args) {
        Asset a1 = new Stock("S1", "2025", 10000, 10, 100);
        Asset a2 = new Bond("B1", "2025", 5000, 5);
        Asset a3 = new Savings("SV1", "2025", 8000, 4);

        a1.displayDetails();
        a2.displayDetails();
        a3.displayDetails();
    }
}
