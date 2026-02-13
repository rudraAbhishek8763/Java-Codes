import java.util.ArrayList;
import java.util.List;
class Q92 {
   static List<Integer> fibonacciNumbers(int n) {
      List<Integer> ans = new ArrayList<>();
      int f1 = 0, f2 = 1;
      ans.add(f1);
      for (int i = 1; i < n; i++) {
         ans.add(f2);
         int next = f1 + f2;
         f1 = f2;
         f2 = next;
      }
      return ans;
   }
   public static void main(String[] args) {
      int n = 7;
      List<Integer> res = fibonacciNumbers(n);
      for (int num : res) {
         System.out.print(num + " ");
      }
   }
}