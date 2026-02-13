class Q96 {
    static int nCr(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }
        if (r == 1) {
            return n;
        }
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }
    public static void main(String[] args) {
        int n = 5, r = 2;
        System.out.println(nCr(n, r));
    }
}
