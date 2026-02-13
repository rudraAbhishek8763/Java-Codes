//Given an integer array arr[], find the subarray (containing at least one element) which has the maximum possible sum, and return that sum.//
  import java.util.Arrays;
public class Q19 {
    static int maxSubarraySum(int[] arr) {
        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                currSum = currSum + arr[j];
                sum = Math.max(sum, currSum);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}

