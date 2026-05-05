import java.util.Scanner;

class Item {
    int code;
    double price;

    void input(int c, double p) {
        code = c;
        price = p;
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.print("Enter code and price for item " + (i + 1) + ": ");
            int c = sc.nextInt();
            double p = sc.nextDouble();
            items[i].input(c, p);
            total += p;
        }

        System.out.println("\nCode\tPrice");
        for (int i = 0; i < 5; i++) {
            items[i].display();
        }

        System.out.println("\nTotal Price = " + total);
    }
}
