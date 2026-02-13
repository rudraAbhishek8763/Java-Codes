class Q61 {
    static int optimalKeys(int n) {
        if (n <= 6)
            return n;
        int max = 0;
        for (int b = n - 3; b >= 1; b--) {
            int curr = (n - b - 1) * optimalKeys(b);
            if (curr > max)
                max = curr;
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(optimalKeys(n));
    }
}