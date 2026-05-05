class LeapYear {
    int year;
    void checkLeapYear() {
        if (year % 4 == 0 && (year % 100 != 0)|| (year % 400 == 0)) {
        System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
public static void main(String[] args) {
    LeapYear obj = new LeapYear();
    obj.year = 2025;
    obj.checkLeapYear();
}
}
