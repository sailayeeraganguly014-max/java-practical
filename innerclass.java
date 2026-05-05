class Outer {
class Parent {
        void show() {
            System.out.println("This is Parent class method");
        }
    }
    class Child extends Parent {
        void display() {
            System.out.println("This is Child class method");
        }
    }

public static void main(String[] args) {
    Outer outer = new Outer();
    Outer.Child obj = outer.new Child();
    obj.show();
    obj.display();
}
}

