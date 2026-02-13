public class Q52 {
    public static String replaceSubstr(String s, String s1,String s2) {
        StringBuilder ans = new StringBuilder();
        int n = s.length(), m = s1.length();
        for (int i = 0; i < n; i++) {
            if (i + m <= n&& s.substring(i, i + m).equals(s1)) {
                ans.append(s2);
                i += m - 1;
            }
            else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args)
    {
        String s = "abababa", s1 = "aba", s2 = "a";
        System.out.println(replaceSubstr(s, s1, s2));
    }
}