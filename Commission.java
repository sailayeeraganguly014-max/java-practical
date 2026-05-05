class Commission {
    double sales;
    Commission(double s) {
        sales=s;
    }

    double commission() {
        double comm=0;
        if(sales<100)
        comm=0;
    else if(sales>=100 && sales<=1000)
        comm=sales*0.10;
    else
    comm=sales*0.20;
    }
}

    public static void main(String[] args) {
        double s=100;
        if(s<0)
            System.out.println("Invalid Input");
        else{
        Commission obj=new Commission(s);
        obj.Commission(s);
        System.out.println("Commission is: "+obj.commission());
    }
}
