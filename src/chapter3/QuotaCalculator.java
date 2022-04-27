package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    //Initialise
    //How many sales did the employee make this week, if the employee made more than 10 sales
    //Send them a message "Congratulations you made your Quota"
    //If the employee didn't hit their quota, send them the following message "You where short of Quota target by xx)


    public static void main(String args[]) {

        int quota = 10;

        System.out.println("How many sales did you make this Quota");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

    if(sales >= quota) {
        System.out.println("Congratulations!! You have made your Quota");
        }
         else{
             int quotaShort = quota - sales;
             System.out.println("You where short of your quota target of "+quota + " by " +quotaShort+".");
    }
}
}
