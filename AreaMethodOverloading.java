class AreaDemo {
    void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
    public static void main(String[] args) {
        AreaDemo obj = new AreaDemo();
        obj.area(5.0);
        obj.area(4, 6);
        obj.area(3.0, 4.0);
}
}
