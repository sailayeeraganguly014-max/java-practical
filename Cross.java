import java.util.*;


interface Gross {
    void calculateGross();
}


class Employee {
    String name;
    double basic;

    void setEmp(String n, double b) {
        name = n;
        basic = b;
    }
}


class Salary extends Employee implements Gross {
    double gross;

    public void calculateGross() {
        gross = basic + (0.2 * basic); 
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Basic: " + basic);
        System.out.println("Gross Salary: " + gross);
    }
}


class Test {
    public static void main(String[] args) {
        Salary s = new Salary();

        s.setEmp("Rahul", 10000);
        s.calculateGross();
        s.display();
    }
}
