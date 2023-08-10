package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        //Display name of a day based on a number
        int day;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a year");
        day=sc.nextInt();

        if(day==1){
            System.out.println("Today is monday");
        }
       else if(day==2){
            System.out.println("Today is tuesday");
    }
        else if(day==3){
            System.out.println("Today is wednesday");
        }
        else if(day==4){
            System.out.println("Today is thusday");
        }
        else if(day==5){
            System.out.println("Today is friday");
        }
        else {
            System.out.println("Today is not a working day");
        }
    }
}
