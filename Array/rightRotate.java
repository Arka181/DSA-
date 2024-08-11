package Array;

public class rightRotate {
    static void rotate(int a[], int n) {
        n = a.length;
        int last = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = last;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 }; // 5,1,2,3,4
        rotate(a, a.length);
    }
}
