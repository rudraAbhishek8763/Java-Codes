
class Q93{
    static int setBits(int n) {

        if (n == 0)
            return 0;

        if((n & 1) == 1)
            return 1 + setBits(n >> 1);

        else
            return setBits(n >> 1);
    }

    public static void main(String[] args) {
        int n = 21;
        System.out.println(setBits(n));
    }
}
