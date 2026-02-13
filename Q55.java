class Q55 {
    static int minRecur(String s, int l, int h) {
        if (l >= h)
         return 0;
        if (s.charAt(l) == s.charAt(h)) {
            return minRecur(s, l + 1, h - 1);
        }
        return Math.min(minRecur(s, l + 1, h), minRecur(s, l, h - 1)) + 1;
    }
    static int findMinInsertions(String s) {
        return minRecur(s, 0, s.length() - 1);
    }
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(findMinInsertions(s));
    }
}