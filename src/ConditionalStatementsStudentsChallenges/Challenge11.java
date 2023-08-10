package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        //Make a manu driven program for arithmetic operations
        int x;
        int y;
        String option;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        x=sc.nextInt();
        y=sc.nextInt();
        sc.nextLine();


        System.out.println("Enter options");
        option=sc.nextLine();
        option=option.toUpperCase();
        switch(option){
            case "ADD":
                System.out.println("Sum is "+(x+y));
                break;
            case "SUB":
                System.out.println("subtraction is "+(x-y));
                break;
            case "MUL":
                System.out.println("multiflication is "+(x*y));
                break;
            case "DIV":
                System.out.println("divition is "+(x/y));
                break;
            default:
                System.out.println("Invalid");
                break;

        }

    }
}
