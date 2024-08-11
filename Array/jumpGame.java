package Array;

public class jumpGame {
    static boolean jump(int a[]){
        int maxIdx=0;
        for(int i=0;i<a.length;i++){
             if(i>maxIdx) return false;
             else
             maxIdx=Math.max(maxIdx, i+a[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int a[]={2,3,1,1,4};
        boolean ans = jump(a);
        System.out.println(ans);
    }
}

