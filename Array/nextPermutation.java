

package Array;

import java.util.Arrays;

public class nextPermutation {
    static void reverse(int a[],int start,int end){
      int temp=a[start];
      a[start]=a[end];
      a[end]=temp;
      start++;
      end--;
    }
    static void nextPer(int a[]){
        int idx=-1;
        int n=a.length;
        // finding the break point 
        for(int i=n-2;i>=0;i--){
          if(a[i]<a[i+1]){
            idx=i;
            break;
          }
        }
        if(idx==-1){
            reverse(a, 0, n-1);
            return;
        }

        for(int i=n-1;i>idx;i--){
            if(a[i]>a[idx]){
                int temp=a[idx];
                a[idx]=a[i];
                a[i]=temp;
                break;
            }
        }
        reverse(a, idx+1, n-1);
    }
    public static void main(String[] args) {
        int a[]={3,2,1};
         nextPer(a);
         System.out.println(Arrays.toString(a));
    }
}
