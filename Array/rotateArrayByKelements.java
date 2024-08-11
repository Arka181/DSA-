package Array;

public class rotateArrayByKelements {
    static void reverse(int a[],int left,int right){
      while(left<=right){
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
        left++;
        right--;
      }
    }

    static void rotateArrright(int a[],int k){
        k=k%a.length;
         reverse(a, 0, a.length-1);
         reverse(a, 0,k-1);
         reverse(a, k,a.length-1);
    }

    static void rotateArrayLeft(int a[],int k){
        k=k%a.length;
     reverse(a, 0, k-1);
     reverse(a, k, a.length-1);
     reverse(a, 0, a.length-1);

    }
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};//3,4,5,1,2
        int k=2;
        int n=a.length;
        // rotateArrright(a, k);
        rotateArrayLeft(a, k);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
