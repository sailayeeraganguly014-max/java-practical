class FactorialProgram {
    int number=5;
    int calculateFactorial() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
public static void main(String[] args) {
    FactorialProgram obj = new FactorialProgram();
    int result = obj.calculateFactorial();
    System.out.println("Factorial of " + obj.number + " is: " + result);
}
}
