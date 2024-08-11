package Array;

/**
 * first
 */
public class first {
   static int findLargdestElement(int  arr[]){
       int max=arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       return max;
   }

    public static void main(String[] args) {
        int a[] = { 2, 5,11, 1, 3, 0 };
        int ans = findLargdestElement(a);
        System.out.println("the largest element in the array is " + ans);
    }
}