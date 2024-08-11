package Array;
/**
 * secondLargest
 */
public class secondLargest {
    static int secondSmallest(int a[],int n){
       int min=Integer.MAX_VALUE;
       int second_min=Integer.MAX_VALUE;
       for(int i=0;i<a.length;i++){
        if(a[i]<min){
            second_min=min;
            min=a[i];
        }else if (a[i]<second_min && a[i]!=min){
            second_min=a[i];
        }
       }
       return second_min;
    }
 static int findSecondMax(int arr[],int n){
      int large=Integer.MIN_VALUE;
      int Second_large=Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
        if(arr[i]>large){
            Second_large=large;
            large=arr[i];
        }else if(arr[i]>Second_large && arr[i]!=large){
           Second_large=arr[i];
        }
      }
      return Second_large;

 }
    public static void main(String[] args) {
        int b[]={2,4,2,1,3,4};
        int ans =findSecondMax(b, b.length);
        int sol=secondSmallest(b, b.length);

        System.out.print("The Second maximum element in the given array is "+ ans );
        System.out.println();
        System.out.print("The Second minimum element in the given array is "+sol);
    }
}