package Array;

public class MissingNumber {
    // static int Miss(int a[],int n ){
    //      n=a.length;
    //      int givenSum=0;
    //     int totalSum=n*(n+1)/2;
    //     for(int i=0;i<n-1;i++){
    //        givenSum=givenSum+a[i];
    //     }
    //     return (totalSum-givenSum);
    // }


    //best Xor solution
    static int Miss(int a[],int n){
    n=a.length;
    int xor1=0;
    int xor2=0;
    for(int i=0;i<n-1;i++){
        xor2=xor2^a[i];
    }
    for(int i=1;i<=n;i++){
        xor1=xor1^i;
    }
    return xor1^xor2;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int ans = Miss(a, a.length);
        System.out.print(ans);
    }
}
