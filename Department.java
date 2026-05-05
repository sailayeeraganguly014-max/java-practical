import java.util.*;


interface Department {
    void setDept(String name, String head);
    void showDept();
}

class Hostel {
    String hostelName, location;

    void setHostel(String n, String l) {
        hostelName = n;
        location = l;
    }

    void showHostel() {
        System.out.println("Hostel: " + hostelName + ", Location: " + location);
    }
}


class Student extends Hostel implements Department {
    String name, subject, deptName, deptHead;
    int regNo;

    void getData(Scanner sc) {
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Reg No: ");
        regNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Subject: ");
        subject = sc.nextLine();

        System.out.print("Hostel Name: ");
        String h = sc.nextLine();

        System.out.print("Location: ");
        String l = sc.nextLine();
        setHostel(h, l);

        System.out.print("Dept Name: ");
        deptName = sc.nextLine();

        System.out.print("Dept Head: ");
        deptHead = sc.nextLine();
    }

    public void setDept(String name, String head) {
        deptName = name;
        deptHead = head;
    }

    public void showDept() {
        System.out.println("Department: " + deptName + ", Head: " + deptHead);
    }

    void display() {
        System.out.println("\nName: " + name + ", RegNo: " + regNo);
        System.out.println("Subject: " + subject);
        showHostel();
        showDept();
    }
}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            System.out.println("\n1.Admit  2.Migrate  3.Display  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                s.getData(sc);
            }
            else if (ch == 2) {
                System.out.print("Enter Reg No: ");
                int r = sc.nextInt();
                sc.nextLine();

                if (s.regNo == r) {
                    System.out.print("New Hostel: ");
                    String h = sc.nextLine();

                    System.out.print("New Location: ");
                    String l = sc.nextLine();

                    s.setHostel(h, l);
                } else {
                    System.out.println("Not Found");
                }
            }
            else if (ch == 3) {
                s.display();
            }
            else {
                break;
            }
        }
    }
}
