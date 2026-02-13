import java.util.*;
public class Q62 {
    static String removeKChar(int k, String str) {
        if (k == 1) return "";
        StringBuilder ans = new StringBuilder();
        Stack<Pair<Character, Integer>> stk = new Stack<>();
        for (char c : str.toCharArray()) {
            if (stk.isEmpty()) {
                stk.push(new Pair<>(c, 1));
            } else {
                if (c == stk.peek().getKey()) {
                    Pair<Character, Integer> p = stk.pop();
                    if (p.getValue() + 1 < k) stk.push(new Pair<>(p.getKey(), p.getValue() + 1));
                } else {
                    stk.push(new Pair<>(c, 1));
                }
            }
        }
        while (!stk.isEmpty()) {
            Pair<Character, Integer> top = stk.pop();
            for (int i = 0; i < top.getValue(); i++) {
                ans.append(top.getKey());
            }
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int k = 2;
        System.out.println(removeKChar(k, s));
    }
}
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }
}
