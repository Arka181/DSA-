package Array;

import java.util.HashMap;

/**
 * longestSubarraySum
 */
public class longestSubarraySum {

    static int longestsubArray(int a[],int k){
       HashMap<Integer,Integer> m=new HashMap<>();
       int n=a.length;
       int sum=0;
       int maxLen=0;
       for(int i=0;i<n;i++){
         sum+=a[i];
       
       if(sum==k){
        maxLen=Math.max(maxLen, i+1);
       }
       int rem=sum-k;
       if(m.containsKey(rem)){
        int len=i-m.get(rem);
        maxLen=Math.max(maxLen, len);
       }
       if(!m.containsKey(sum)){
        m.put(sum, i);
       }
    }
    return maxLen;
    }

    public static void main(String[] args) {
        int a[]={1,-1,1};
        int k=1;
        int ans = longestsubArray(a, k);
        System.out.println(ans);
    }
}
