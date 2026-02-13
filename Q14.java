//Given an sorted array arr[] of integers, rearrange the elements into a wave-like array.//
import java.util.*;
 public class Q14{
    void sortInWave(int arr[]){
        int n = arr.length;


        for (int i=0; i<n-1; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    public static void main(String args[]){
        Q14 ob = new Q14();
        int arr[] = {1, 2, 3, 4, 5};
        ob.sortInWave(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}