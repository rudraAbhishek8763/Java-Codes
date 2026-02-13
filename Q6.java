//For a given period, everyday patients arrive at the hospital for an examination. The hospital initially has 7 doctors. Each doctor can treat only one patient per day, but sometimes there is a shortage of doctors, so the untreated patients are sent to other hospitals. Every third day the hospital makes calculations and if the number of untreated patients is greater than the treated patients, they hire one more doctor. The hire happens before the daily patient's admission begins.
//Write a program, that calculates for a given period the number of treated and untreated patients//.
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        int doctors = 7;
        int treated = 0;
        int untreated = 0;


        for (int day = 1; day <= days; day++) {
            System.out.print("Enter number of patients for day " + day + ": ");
            int patients = scanner.nextInt();


            if (day % 3 == 0 && untreated > treated) {
                doctors++;
            }


            if (patients <= doctors) {
                treated += patients;
            } else {
                treated += doctors;
                untreated += (patients - doctors);
            }
        }

        System.out.println("\nTotal treated patients: " + treated);
        System.out.println("Total untreated patients: " + untreated);



    }
}

