  public class Q30{
    static int maxSum(int[] arr) {
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {

                int index = (i + j) % n;
                sum += j * arr[index];
            }
            res = Math.max(res, sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 1, 2};
        System.out.println(maxSum(arr));
    }
}
