class Student{
    String name;
    int age;
    Student(){
        name="Unknown";
        age=0;
        System.out.println("Default Constructor Called");
    }
    Student(String n){
        name=n;
        age=0;
        System.out.println("Constructor with One Parameter Called");
    }
    Student(String n,int a){
        name=n;
        age=a;
        System.out.println("Constructor with Two Parameter Called");
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println();
    }
    public static void main(String[] args){
        Student obj1=new Student();
        obj1.display();
        Student obj2=new Student("Rahul");
        obj2.display();
        Student obj3=new Student("Anita",20);
        obj3.display();
    }
}
