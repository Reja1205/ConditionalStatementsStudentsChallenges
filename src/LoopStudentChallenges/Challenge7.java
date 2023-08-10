package LoopStudentChallenges;

import java.util.Scanner;

public class Challenge7 {
    //6.	Finding a number is armstrong or not

    public static void main(String[] args) {

        int n;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        n=sc.nextInt();
        int m=n;
        int sum=0;
        while(n>0){
           int r=n%10;
           n=n/10;
            sum=sum+r*r*r;

        }
        if (sum==m){
            System.out.println("Its an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");


        }


    }
}
