package Array;

public class linerSearch {
    static int  search(int a[],int x){
       for(int i=0;i<a.length;i++){
        if(a[i]==x){
            return i;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        int a[]={2,5,1,3,0};
        int x=3;
        int ans = search(a, x);
        System.out.println("Element found at "+ans+" index" );
    }
}
