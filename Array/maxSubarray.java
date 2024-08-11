package Array;

public class maxSubarray {
    static int SubarraySum(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];       max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = SubarraySum(a);
        System.out.println(ans);
    }
}
