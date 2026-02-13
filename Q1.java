//Write a Java program to get a number from the user and print whether it is positive or negative.//
import java.util.*;;
public class Q1 {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int num = sc.nextInt();
if (num>0) {
    System.out.println("number is positive");
}
else if (num<0) {
      System.out.println("number is negative");
}
else {
System.out.println("number is zero");
}
}
}