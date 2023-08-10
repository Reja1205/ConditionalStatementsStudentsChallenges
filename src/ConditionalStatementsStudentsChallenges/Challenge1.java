package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge1 {
    //Find a number is odd or not

    public static void main(String[] args) {
        int n;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();

        if(n%2==0){
            System.out.println("This is even number");
        }
        else{
            System.out.println("This is odd number");
        }
    }
}
