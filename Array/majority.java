package Array;
/**
 * majority
 */
public class majority {
    static int major(int a[]){
        int cand=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(count==0){
                cand=a[i];
            }
            if(count==a[i]){
                count++;
            }else{
                count--;
            }
        }
        return cand;
        
       
    }

    public static void main(String[] args) {
        int a[]={2,2,1,1,2,2,2};
        System.out.println(major(a));
}
}