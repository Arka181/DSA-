package Array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    static boolean sumCheck(int a[],int n,int target){
        Arrays.sort(a);
        int l=0;
        int r=a.length-1;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum==target){
                return true;
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }

    //second approach
   
    public static void main(String[] args) {
        int a[]={2,6,5,1};
        int n=a.length;
        int target = 14;
        boolean ans = sumCheck(a, n, target);
        System.out.print(ans);

    }
}
