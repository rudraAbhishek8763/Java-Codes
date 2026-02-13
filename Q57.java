class Q57 {
    static boolean hasAllChars(String sub, String p) {
        int[] count = new int[256];
        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i)]++;
        }
        for (int i = 0; i < sub.length(); i++) {
            if (count[sub.charAt(i)] > 0)
                count[sub.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0)
                return false;
        }
        return true;
    }
    static String minWindow(String s, String p) {
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (hasAllChars(sub, p)) {
                    int currLen = sub.length();
                    if (currLen < minLen) {
                        minLen = currLen;
                        res = sub;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";
        String result = minWindow(s, p);
        if (!result.isEmpty())
            System.out.println(result);
        else
            System.out.println("");
    }
}