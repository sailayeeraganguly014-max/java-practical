class NumberCheck {
    int num;
    void checkNumber(){
        if(num>0){
            System.out.println(num+" is a Positive number");
        }
        else if(num<0){
            System.out.println(num+" is a Negative number");
        }
        else{
            System.out.println("The number is zero");
        }   
    }
    

public static void main(String[] args){
    NumberCheck obj=new NumberCheck();
    obj.num=10;
    obj.checkNumber();
}
}
