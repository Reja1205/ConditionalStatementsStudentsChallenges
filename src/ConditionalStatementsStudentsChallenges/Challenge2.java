package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge2 {
    //Find a person is young or not

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        if(n>=14&&n<=55){
            System.out.println("The person is young");
        }
        else{
            System.out.println("The person isn't Young");
        }

    }
}
