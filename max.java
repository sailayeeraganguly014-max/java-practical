 class Maximum {
    int a,b,c;
    void findMaximum(){
        if(a>=b && a>=c){
            System.out.println("Maximum number is: "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("Maximum number is: "+b);
        }
        else{
            System.out.println("Maximum number is: "+c);
        }
    }
public static void main(String[] args){
    Maximum obj=new Maximum();
    obj.a=15;
    obj.b=42;
    obj.c=27;
    obj.findMaximum();
}
}
