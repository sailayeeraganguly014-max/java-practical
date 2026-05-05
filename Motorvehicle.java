abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String name, int number, double price) {
        modelName = name;
        modelNumber = number;
        modelPrice = price;
    }

    void display() {
        System.out.println(modelName + " " + modelNumber + " Price: " + modelPrice);
    }
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String name, int number, double price, double rate) {
        super(name, number, price);
        discountRate = rate;
    }

    double discount() {
        return modelPrice * discountRate / 100;
    }

    void display() {
        System.out.println(modelName + " " + modelNumber +
                " Price: " + modelPrice +
                " Discount: " + discount());
    }

    public static void main(String[] args) {
        Car c = new Car("Toyota", 123, 500000, 10);
        c.display();
    }
}
