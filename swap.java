class Swap {
    int a, b;
    void swapNumbers() {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
public static void main(String[] args) {
    Swap obj = new Swap();
    obj.a = 10;
    obj.b = 20;
    System.out.println("Before swapping:" );
    System.out.println("a = " + obj.a);
    System.out.println("b = " + obj.b);
    obj.swapNumbers();
    System.out.println("After swapping:");
    System.out.println("a = " + obj.a);  
    System.out.println("b = " + obj.b);
}
}
