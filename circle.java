import java.util.Scanner;


class Point {
    int x, y;

    
    void setPoint(int a, int b) {
        x = a;
        y = b;
    }
}

class Circle {
    double radius;
    Point p; 

    
    void input(int x, int y, double r) {
        p = new Point();   
        p.setPoint(x, y);  
        radius = r;
    }

    
    void display() {
        double area = Math.PI * radius * radius;

        System.out.println("Center Point: (" + p.x + ", " + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter x and y coordinates of center: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        c.input(x, y, r);
        c.display();

        sc.close();
    }
}
