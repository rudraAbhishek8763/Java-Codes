//Given an integer, print its first 10 multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.//
import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter an integer: ");
        int n= scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n+ " x " + i + " = " + (n * i));
        }

    }
}