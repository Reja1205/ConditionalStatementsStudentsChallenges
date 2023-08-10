package LoopStudentChallenges;

public class FibonecciSequence {
    public static void main(String[] args) {
        //0,1,2,3,,5,8,13,21

        int num1=0,num2=1;
        System.out.print(num1+","+num2);
        int n=10;
        for(int i=2;i<=10;i++){
            int sum=num1+num2;
            System.out.print(","+sum);
            num1=num2;
            num2=sum;
        }

    }
}
