class Q58{
    static int lps(String s, int low, int high) {
        if (low > high) return 0;
        if (low == high)
            return 1;
        if (s.charAt(low) == s.charAt(high))
            return lps(s, low + 1, high - 1) + 2;
        return Math.max(lps(s, low, high - 1), lps(s, low + 1, high));
    }
    static int longestPalinSubseq(String s) {
        return lps(s, 0, s.length() - 1);
    }
    public static void main(String[] args) {
        String s = "bbabcbcab";
        System.out.println(longestPalinSubseq(s));
    }
}
