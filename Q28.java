import java.util.*;

public class Q28{
    public static int minCandy(int[] arr)
    {
        int n = arr.length;
        if (n == 0)
            return 0;
        int[] leftCandy = new int[n];
        int[] rightCandy = new int[n];
        Arrays.fill(leftCandy, 1);
        Arrays.fill(rightCandy, 1);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                leftCandy[i] = leftCandy[i - 1] + 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1])
                rightCandy[i] = rightCandy[i + 1] + 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.max(
                leftCandy[i],
                rightCandy[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 15, 40, 32, 12, 17, 23 };
        System.out.println(minCandy(arr));
    }
}