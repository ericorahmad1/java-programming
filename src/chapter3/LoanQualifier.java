package chapter3;

import java.util.Scanner;
/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String[] args) {

//        Initialize what we know
        int requriedSalary = 30000;
        int requiredYearEmployed = 2;
//        Get what we don't
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

//        Make decision
        if (salary >= requriedSalary){
            if (years >= requiredYearEmployed){
                System.out.println("Congrats! You qualify for the loan");
            } else {
                System.out.println("Sorry, you must have worked at your current job " + requiredYearEmployed + " years.");
            }
        } else {
            System.out.println("Sorry, you must earn at least $" + requriedSalary + " to qualify for the loan");
        };

    }
}
