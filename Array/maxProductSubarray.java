package Array;

public class maxProductSubarray {
    static int maxProduct(int a[]){
        int pre=1;
        int suf=1;
        int ans = Integer.MIN_VALUE;
     for(int i=0;i<a.length;i++){
           if(pre==0) pre=1;
           if(suf==0) suf=1;
           pre=pre*a[i];
           suf=suf*a[a.length-i-1];
           ans=Math.max(ans, Math.max(pre, suf));
     }
     return ans;
    }
    public static void main(String[] args) {
        int a[]={2,3,-2,4};
        int n = maxProduct(a);
        System.out.println(n);
    }
}
