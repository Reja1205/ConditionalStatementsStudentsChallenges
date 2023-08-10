package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge5 {
    //Find a given year is a leap year or not
    public static void main(String[] args) {

        int year;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a year");
        year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("This is a leap year");
                }
                else{
                    System.out.println("This isnt a leap year");
                }
            }
            else{
                System.out.println("This is a leap year");
            }
        }
        else{
            System.out.println("Not a leap year");
        }


    }
}
