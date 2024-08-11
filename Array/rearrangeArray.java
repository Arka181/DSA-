package Array;

public class rearrangeArray {

    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    } 
    static void arrayArrange(int a[]){
         int odd=1;
         int even=0;
         int ans[]=new int[a.length];
         for(int i=0;i<a.length;i++){
            if(a[i]<0){
            ans[odd]=a[i];
            odd+=2;
            }else{
                ans[even]=a[i];
                even+=2;
            }
         }
            
    }
    public static void main(String[] args) {
        int a[]={1,2,-6,-7};
        printArray(a);
        arrayArrange(a);
        
    }
}