package Array;

public class buyandSell {
    static int stockBuy(int a[]){
      int miniSofar=a[0];
      int maxProfit=0;
      for(int i=0;i<a.length;i++){
        miniSofar=Math.min(miniSofar, a[i]);
        int profit=a[i]-miniSofar;
        maxProfit=Math.max(maxProfit, profit);
      }
      return maxProfit;
    }
    public static void main(String[] args) {
        int a[]={5,2,6,1,4};
        int ans = stockBuy(a);
        System.out.print("The max  profit is "+ans );
    }
}
