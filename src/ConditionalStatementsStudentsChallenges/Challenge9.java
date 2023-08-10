package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        //Display name of month based on number

        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        number=sc.nextInt();

        switch(number){

            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Not a valid number");

        }

    }
}
