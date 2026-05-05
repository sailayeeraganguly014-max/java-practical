import java.util.*;


interface Exam {
    void percent_cal();
}

class Student {
    String name;
    int roll_no, marks1, marks2;

    void getData(String n, int r, int m1, int m2) {
        name = n;
        roll_no = r;
        marks1 = m1;
        marks2 = m2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
    }
}


class Result extends Student implements Exam {
    double per;

    public void percent_cal() {
        per = (marks1 + marks2) / 2.0;
    }

    void display() {
        show();
        System.out.println("Percentage: " + per);
    }
}


class Test {
    public static void main(String[] args) {
        Result r = new Result();

        r.getData("Rahul", 1, 80, 90);
        r.percent_cal();
        r.display();
    }
}
