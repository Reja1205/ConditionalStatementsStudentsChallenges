package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Chaleenge6 {
    public static void main(String[] args) {
        int year;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a year");
        double years =sc.nextInt();

        if(years%4==0&&years%100!=0||years%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }

}
