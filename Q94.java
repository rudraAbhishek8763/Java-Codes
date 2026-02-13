import java.util.*;
public class Q94 {
    static int recLen(String str) {
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }
    public static void main(String[] args){
        String str = "Rudra Abhishek";
        System.out.println(recLen(str));
    }
}
