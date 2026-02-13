import java.util.*;
public class Q45{
    static String convertToHex(int num) {
        StringBuilder temp = new StringBuilder();
        while (num != 0) {
            int rem = num % 16;
            if (rem < 10) {
                temp.append((char)(rem + '0'));
            } else {
                temp.append((char)(rem - 10 + 'a'));
            }
            num = num / 16;
        }
        return temp.reverse().toString();
    }
    static String encryptString(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int count = 0;
            while (i < n && s.charAt(i) == ch) {
                count++;
                i++;
            }
            i--;
            String hex = convertToHex(count);
            ans.append(ch);
            ans.append(hex);
        }
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(encryptString(s));
    }
}
