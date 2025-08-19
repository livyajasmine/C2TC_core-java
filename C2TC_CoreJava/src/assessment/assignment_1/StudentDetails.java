package assessment.assignment_1;


import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter your Full Name with Initial:");
        String name = sc.nextLine();

        System.out.println("Enter your Roll Number:");
        long rollNo = sc.nextLong();

        System.out.println("Enter your Grade:");
        char grade = sc.next().charAt(0);

        System.out.println("Enter your Percentage:");
        String percentage = sc.next();

        // Printing output
        System.out.println("\n--- Student Details ---");
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(grade);
        System.out.println(percentage);

        sc.close();
    }
}