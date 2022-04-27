package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]){

        //get hours worked
        System.out.println("How many hours did the employee work?");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

        //get employees pay rate
        System.out.println("What is the employees pay rate £?");
        double rate = scanner.nextDouble();
        scanner.close();

        //display employees pay
        double grossPay= rate * hour;

        System.out.println("The employees Gross Pay is £"+ grossPay );

    }
}
