package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge3 {
    //Find grades for given marks

    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();

        float ave=(float)(m1+m2+m3)/3;
        System.out.println(ave);

        if(ave>=80&&ave<=85){
            System.out.println("Grade is A+");
        }
        else if(ave>=70&&ave<=80){
            System.out.println("Grade is A-");
        }
        else{
            System.out.println("Grade is F");
        }

    }
}
