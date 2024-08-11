package Array;

public class reomvefromSortedArray {
    static int removedup(int a[]){
        int j=0;
        for(int i=0;i<a.length;i++){
           if(a[j]!=a[i]){
            j++;
            a[j]=a[i];
           }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,1,2,2,2,2,3,3};
        int k=removedup(a);
        System.out.println("the size of unique element in array after removing the dupicates : "+k);
        // for(int i=0;i<k;i++){
        //     System.out.print(a[i]+" ");
        // }
    }
}
