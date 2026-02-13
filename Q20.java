//Given an array arr[] consisting of positive, negative, and zero values, find the maximum product that can be obtained from any contiguous subarray of arr[].
public class Q20 {
    static int maxProduct(int arr[]) {
      	int n = arr.length;
        int maxProd = arr[0];
        for (int i = 0; i < n; i++) {
            int mul = 1;
            for (int j = i; j < n; j++) {
                mul *= arr[j];
                maxProd = Math.max(maxProd, mul);
            }
        }
        return maxProd;
    }
    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }
}

