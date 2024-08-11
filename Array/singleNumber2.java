
package Array;
public class singleNumber2 {
    static int findSingle(int a[]){
        int ones=0;int twos=0;
      for(int i=0;i<a.length;i++){
          ones^= a[i] & (~twos);
          twos^=a[i] &(~ones);
      }
      return ones;
    }
    public static void main(String[] args) {
        int a[]={2,2,3,2,3,3,4};
        int ans = findSingle(a);
        System.out.print(ans);

    }
}
