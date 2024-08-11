package Array;

import java.util.Arrays;

public class MoveZerosAtend {
  //   // static void move(int a[]){
  //   //     int l=0;
  //   //     int r=a.length-1;
  //   //     while(l<r){
  //   //         if(a[l]==0 && a[r]!=0){
  //   //             int temp=a[l];
  //   //             a[l]=a[r];
  //   //             a[r]=temp;
  //   //         }
  //   //         if(a[l]!=0){
  //   //             l++;
  //   //         }
  //   //         if(a[r]==0){
  //   //             r--;
  //   //         }
  //   //     }
  // static void zero(int a[]){
  //   int j=0;
  //   for(int i=0;i<a.length;i++){
  //       if(a[i]!=0){
  //          swap(a, j, i);
  //          j++;
  //       }
  //   }
  //   for(int i=0;i<a.length;i++){
  //       System.out.print(a[i]+" ");
  //   }

 
  // }
  // static void swap(int a[],int l,int r){
  //       int temp=a[l];
  //       a[l]=a[r];
  //       a[r]=temp;
  // }

  // static void zero(int a[]){
  //   int j=0;
  //     for(int i=0;i<a.length;i++){
  //       if(a[i]!=0){
  //         int temp=a[i];
  //         a[i]=a[j];
  //         a[j]=temp;
  //         j++;
  //       }
  //     }
  // }


  static void zero(int a[]){
    int insertpos=0;
    for(int i=0;i<a.length;i++){
      if(a[i]!=0){
        a[insertpos]=a[i];
        insertpos++;
      }
    }
    while (insertpos<a.length) {
      a[insertpos++]=0;
    }
  }
    public static void main(String[] args) {
        int a[]={1,0,2,0,2,3,0};
        // move(a);
        zero(a);
        for(int num:a){
          System.out.print(num+" ");
        }
        
    }
}
