import java.util.*;
public class Q72 {
    static int distinctSubseq(String str) {
        int n = str.length();
        int[] last = new int[26];
        Arrays.fill(last, 0);
        int res = 1;
        for (int i = 1; i <= n; i++) {
            int cur = 2 * res - last[str.charAt(i - 1) - 'a'];
            last[str.charAt(i - 1) - 'a'] = res;
            res = cur;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(distinctSubseq(str));
    }
}
