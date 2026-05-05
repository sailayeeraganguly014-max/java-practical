class ReverseNumber{
    int number;
    void reverse() {
        int reversed = 0;
        int remainder;
        int temp = number;
        while (temp != 0) {
            remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp=temp/10;
        }
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }
public static void main(String[] args) {
    Reverse obj = new Reverse();
    obj.number = 1234;
    obj.reverse();
}
}
