import java.util.Scanner;

public class MoreData {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First Name: ");
        String firstName = sc.next();
        System.out.print("Last Name: ");
        String lastName = sc.next();
        System.out.print("Grade (9-12): ");
        int grade = sc.nextInt();
        System.out.print("Student ID: ");
        int studentId = sc.nextInt();
        System.out.print("Login: ");
        String login = sc.next();
        System.out.print("Average: ");
        double avg = sc.nextDouble();
        System.out.println("Your information:");
        System.out.println("     Login: " + login);
        System.out.println("     ID:    " + studentId);
        System.out.println("     Name:  " + lastName + ", " + firstName);
        System.out.println("     Avg:   " + avg);
        System.out.println("     Grade: " + grade);
    }
}
