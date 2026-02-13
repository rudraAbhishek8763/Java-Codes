import java.util.Arrays;
import java.util.ArrayList;
class Q29 {
    static int checkPalindrome(int[] num) {
        int n = num.length;
        for (int i = 0; i < n / 2; ++i) {
            if (num[i] != num[n - 1 - i]) {
                return 0;
            }
        }
        return 1;
    }
     static ArrayList<Integer> nextPalindrome(int[] num) {
        int n = num.length;
        while (checkPalindrome(num) == 0) {
            int carry = 1;
            for (int i = n - 1; i >= 0; --i) {
                num[i] += carry;
                if (num[i] == 10) {
                    num[i] = 0;
                    carry = 1;
                } else {
                    carry = 0;
                    break;
                }
            }

            if (carry == 1) {
                num = Arrays.copyOf(num, n + 1);
                System.arraycopy(num, 0, num, 1, n);
                num[0] = 1;
                n++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int digit : num) {
            result.add(digit);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] num = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        ArrayList<Integer> res = nextPalindrome(num);

        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
