package Array;

public class sortO12 {
    static void sorting012(int a[]){
          int low=0;
          int mid=0;
          int high=a.length-1;
          while(mid<=high){
            if(a[mid]==0){
                int temp = a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else if(a[mid]==2){
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
          }
    }
    public static void main(String[] args) {
        int a[]={2,0,2,1,1,0};
        sorting012(a);
        System.out.print("After sorting: ");
        for(int num:a){
            System.out.print(num+" ");
        }
    }
    
}
