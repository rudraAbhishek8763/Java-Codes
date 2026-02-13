//Given an array of integers arr[] of size n, the task is to rotate the array elements to the left by d positions.//
import java.util.Arrays;
public class Q10 {
    static void rotateArr(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int d = 4;
        rotateArr(arr, d);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

