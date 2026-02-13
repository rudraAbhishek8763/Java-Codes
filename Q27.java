//Given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.//
import java.util.Arrays;
 public class Q27{
    static int minJumpsRecur(int i, int[] arr) {
        if (i >= arr.length - 1)
            return 0;
        int ans = Integer.MAX_VALUE;
        for (int j = i + 1; j <= i + arr[i]; j++) {
            int val = minJumpsRecur(j, arr);
            if (val != Integer.MAX_VALUE)
                ans = Math.min(ans, 1 + val);
        }
        return ans;
    }
    static int minJumps(int[] arr) {
        int ans = minJumpsRecur(0, arr);
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        System.out.println(minJumps(arr));
    }
}