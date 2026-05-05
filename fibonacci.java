class Fibonacci {
    int n;
    void displaySeries() {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <=n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
public static void main(String[] args) {
    Fibonacci obj = new Fibonacci();
    obj.n = 10;
    obj.displaySeries();
}
}
