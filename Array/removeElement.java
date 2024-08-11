package Array;

public class removeElement {
    static int remove(int a[], int val) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != val) {
                a[count] = a[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 2, 3 };
        int val = 3;
        int ans = remove(a, val);
        System.out.println(ans); // after removing the value ,it returns the count of the available elemenrts
    }
}
