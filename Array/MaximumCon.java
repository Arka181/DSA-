package Array;

public class MaximumCon {
    static int maxOne(int a[]){
      int count=0;
      int max=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==1){
            count++;
        }else{
            count=0;
        }
        max=Math.max(max, count);
    }
    return max;
    }
    public static void main(String[] args) {
        int a[]={1,1,0,1,1,1};
       int ans =  maxOne(a);
       System.out.print("Max Consecutive ones are "+ ans );
    }
}
