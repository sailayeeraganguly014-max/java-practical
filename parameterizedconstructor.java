class ParameterizedConstructor{
    int number;
    String name;
    ParameterizedConstructor(int num, String n){
        number=num;
        name=n;
    }
    void display(){
        System.out.println("Number: "+number);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        ParameterizedConstructor obj=new ParameterizedConstructor(101,"John");
        obj.display();
    }
}
