class Q91 {
    static boolean isPalindromeUtil(String s, int left, int right) {
        if (left >= right)
            return true;
        if (s.charAt(left) != s.charAt(right))
            return false;
        return isPalindromeUtil(s, left + 1, right - 1);
    }
    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        return isPalindromeUtil(s, left, right);
    }

    public static void main(String[] args) {
        String s = "abba";
        if (isPalindrome(s)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
