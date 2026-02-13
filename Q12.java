//Finding the largest element in an array is a common programming task. 
import java.util.*;
public class Q12 {

    public static void main(String[] args)
    {

        int arr[] = {20, 10, 20, 4, 100};

        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1]);
    }
}

