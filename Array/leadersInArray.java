package Array;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;

public class leadersInArray {
    static ArrayList<Integer> leader(int a[]){
       ArrayList<Integer> ans =new ArrayList<>();
       int rMax=Integer.MIN_VALUE;
       for(int i=a.length-1;i>=0;i--){
        if(a[i]>rMax){
            ans.add(a[i]);
            rMax=a[i];
        }
       }
       Collections.reverse(ans);
       return ans;
    }
    public static void main(String[] args) {
        int a[]={10,22,12,3,0,6};
        ArrayList<Integer> ans = leader(a);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
