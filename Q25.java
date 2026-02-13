 //Minimum number of increment-other operations to make all array elements equal//
 import java.util.*;
public class Q25 {
    public static int minOps(int[] arr) {
        int n = arr.length;
        int cnt = 0;

        Arrays.sort(arr);

        while (arr[0] != arr[n - 1]) {
            for (int i = 0; i < n - 1; i++) {
                arr[i]++;
            }
            cnt++;
            Arrays.sort(arr);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(minOps(arr));
    }
}

