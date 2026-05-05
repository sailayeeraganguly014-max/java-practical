class ZeroArgumentConstructor {
    int number;
    ZeroArgumentConstructor() {
        number = 100;
        System.out.println("0-Argument Constructor Called");
    }
    void display() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        ZeroArgumentConstructor obj = new ZeroArgumentConstructor();
        obj.display();
    }
}
