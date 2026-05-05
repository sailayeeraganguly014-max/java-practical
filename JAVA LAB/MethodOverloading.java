 class OverloadDemo{
    void display(int a){
        System.out.println("Integer value: "+a);
    }
    void display(double a){
        System.out.println("Double value: "+a);
    }
    void display(int a,int b){
        System.out.println("Sum of two integers: "+(a+b));
    }
    public static void main(String[] args){
        OverloadDemo obj = new OverloadDemo();
        obj.display(10);
        obj.display(5.5);
        obj.display(4,6);
    }
}
