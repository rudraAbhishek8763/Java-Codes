import java.util.*;
class Q98 {
    static double sum(int n){
        if (n == 0)
            return 1;
        double ans = 1 / (double)Math.pow(3, n) + sum(n - 1);
        return ans;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(sum(n));
    }
}
