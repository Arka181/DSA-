package Array;

public class mergeSortjava {

     void mergeSort(int a[],int l,int r){
     if(l<r){
        int mid=(l+r)/2;
        mergeSort(a, l, mid);
        mergeSort(a, mid+1, r);
        merge(a, l, mid, r);
     }
    }

    static void merge(int a[],int l,int mid,int r){
     int n1=mid-l+1;
     int n2=r-mid;

     int L[]=new int[n1];
     int R[]=new int[n2];
     for(int i=0;i<n1;i++){
        L[i]=a[l+i];
     }

     for(int j=0;j<n2;j++){
        R[j]=a[mid+1+j];
     }

int i=0,j=0;
int k=l;

while(i<n1 && j<n2){
    if(L[i]<=R[j]){
        a[k]=L[i];
        i++;
    }else{
        a[k]=R[j];
        j++;
    }
    k++;
}

while (i<n1) {
    a[k]=L[i];
    k++;
    i++;
}
while (j<n2) {
    a[k]=R[j];
    k++;
    j++;
}



    }
    public static void main(String[] args) {
        int a[]={12,11,13,5,6,7};
      

    }
}
