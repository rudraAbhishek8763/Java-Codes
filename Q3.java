//Check the number is odd or even using bitwise operator//
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if ((num&1)==1) {
            System.out.println("Your num  is odd");
        } else {
             System.out.println("Your num  is even");
        }
    }
}
