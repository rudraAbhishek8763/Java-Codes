class Q70 {
    static int countSubstr(String s, int k) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            boolean[] map = new boolean[26];
            int distinctCnt = 0;
            for (int j = i; j < n; j++) {
                if (!map[s.charAt(j) - 'a']) {
                    map[s.charAt(j) - 'a'] = true;
                    distinctCnt++;
                }
                if (distinctCnt == k) ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        int k = 2;
        System.out.println(countSubstr(s, k));
    }
}
