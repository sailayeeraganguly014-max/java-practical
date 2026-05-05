 class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }
    class Cat extends Animal {
        void sound() {
            System.out.println("Cat meows");
        }
    }
    class Demo {
        public static void main(String[] args) {
            Animal obj;
            obj=new Dog();
            obj.sound();
            obj=new Cat();
            obj.sound();
        }
    }
}
