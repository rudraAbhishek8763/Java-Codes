//Check whether the string is Palindrome or not.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the word");
       String word = sc.nextLine();
       if (isPalindrome(word)) {
        System.out.println("the word is Palindrome:" +word);
       } else {
  System.out.println("the word is not Palindrome:" +word);
       }
    }
public static boolean isPalindrome(String str){
int left =0;
int right = str.length()-1;
while (left<right){
    if (str.charAt(left)!=str.charAt(right)){
return false;
    }
left++;
right--;
}
return true;
}
}