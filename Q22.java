//Given an array of positive numbers, calculate the number of possible contiguous subarrays having product lesser than a given number K.
public class Q22 {
    static int countsubarray(int array[], int n, int k)
    {
        int count = 0;
        int i, j, mul;

        for (i = 0; i < n; i++) {
            if (array[i] < k)
                count++;
            mul = array[i];
            for (j = i + 1; j < n; j++) {
                mul = mul * array[j];
                if (mul < k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        int array[] = { 1, 2, 3, 4 };
        int k = 10;
        int size = array.length;

        int count = countsubarray(array, size, k);
        System.out.print(count);
    }
}
