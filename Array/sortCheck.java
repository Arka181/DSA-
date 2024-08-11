package Array;

public class sortCheck {
    static boolean checkingArray(int a[], int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      int a[]={1,2,3,4,5,6};
      boolean ans=checkingArray(a, a.length);
      System.out.print(ans);
    }
}
