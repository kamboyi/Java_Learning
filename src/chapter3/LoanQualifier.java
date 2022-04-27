package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    /*
    To qualify for a loan, applicant needs to earn $30,000 or more
    Must have been employed at their current company for 2 years or more
     */

    public static void main(String args[]){
        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("What is your yearly salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("How mny years have you been at the company");
        double years = scanner.nextDouble();
        scanner.close();

        if (salary >= requiredSalary){
            if (years >= requiredYears){
                System.out.println("Congratulations, you qualify for the loan!!");
            }
            else{
                System.out.println("Sorry you have not been at your current employment for "+requiredYears+" years.");
            }

        }
        else{
            System.out.println("Sorry you do not meet the required salary of "+requiredSalary+".");
        }

    }
}
