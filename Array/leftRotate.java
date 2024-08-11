package Array;

public class leftRotate {
    static void rotateSolve(int a[]) {
        int temp = a[0];   // storing first element in the temp varible 
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 }; //2,3,4,5,1
        rotateSolve(a);
    }
}
