package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    /*
    if statement
    if a salesman exceeds 10 they get an extra £250
    salary is 1000

     */

    public static void main(String args[]){

        //initialise what we know = salary is 1000

        int Salary = 1000;
        int Bonus = 250;
        int BonusTarget = 10;

        //Get value of sales
        System.out.println("How man sales did the employee make?");
        Scanner scanner = new Scanner(System.in);
        int NumberOfSales = scanner.nextInt();
        scanner.close();

        //All employees exceed 10 sales, they get 250
        if(NumberOfSales >= BonusTarget){
            Salary = Salary + Bonus;
        }
        System.out.println("The employees Salary is £ " + Salary);
    }
}
