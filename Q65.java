import java.util.*;
public class Q65 {
    public static ArrayList<String> palindromicSubstr(String s) {
        int n = s.length();
        Set<String> result = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String cur = "";
            for (int j = i; j < n; j++) {
                cur += s.charAt(j);
                int l = 0, r = cur.length() - 1;
                boolean isPalindrome = true;
                while (l < r) {
                    if (cur.charAt(l) != cur.charAt(r)) {
                        isPalindrome = false;
                        break;
                    }
                    l++;
                    r--;
                }
                if (isPalindrome) {
                    result.add(cur);
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        String s = "abaaa";
        ArrayList<String> result = palindromicSubstr(s);
        for (String s1 : result)
            System.out.print(s1 + " ");
    }
}
