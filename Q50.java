class Q50 {
  public static String ReFormatString(String S, int K) {
    String temp = "";
    int n = S.length();
    for (int i = 0; i < n; i++) {
      if (S.charAt(i) != '-') {
        temp += (Character.toUpperCase(S.charAt(i)));
      }
    }
    int len = temp.length();
    String ans = "";
    int val = K;
    for (int i = len - 1; i >= 0; i--) {
      if (val == 0) {
        val = K;
        ans += '-';
      }
      ans += temp.charAt(i);
      val--;
    }
    char[] charArray = ans.toCharArray();
    reverse(charArray, charArray.length);
    String res = new String(charArray);
    return res;
  }
  static void reverse(char a[], int n)
  {
    char t;
    for (int i = 0; i < n / 2; i++) {
      t = a[i];
      a[i] = a[n - i - 1];
      a[n - i - 1] = t;
    }
  }

  public static void main(String args[]) {
    String s = "5F3Z-2e-9-w";
    int K = 4;
    System.out.println(ReFormatString(s, K));
  }
}
