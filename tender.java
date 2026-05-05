import java.util.Scanner;

class Tender {
    double cost;
    String company;

    void input(String c, double co) {
        company = c;
        cost = co;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

        double min = Double.MAX_VALUE;
        String minCompany = "";

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();

            System.out.print("Enter company name and cost: ");
            String name = sc.next();
            double cost = sc.nextDouble();

            t[i].input(name, cost);

            if (cost < min) {
                min = cost;
                minCompany = name;
            }
        }

        System.out.println("Company with minimum cost: " + minCompany);

        sc.close();
    }
}
