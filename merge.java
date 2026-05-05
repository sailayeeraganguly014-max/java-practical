class MergeArrays{
    int A[]={1,3,5};
    int B[]={2,4,6};
    int C[];
    MergeArrays(){
        C=new int[A.length+B.length];
        merge();
        display();
    }
    void merge(){
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length){
            if(A[i]<B[j]){
                C[k++]=A[i++];
            }
            else{
                C[k++]=B[j++];
            }
        }
        while(i<A.length){
            C[k++]=A[i++];
        }
        while(j<B.length){
            C[k++]=B[j++];
        }
    }
    void display(){        
        for(int i=0;i<C.length;i++)
            System.out.print(C[i]+" ");
    }
    public static void main(String[] args) {
        MergeArrays obj=new MergeArrays();
    }
}
