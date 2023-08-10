package LoopStudentChallenges;

public class Challenge6 {
    //5.	Count digits of a number
    public static void main(String[] args) {
        int n=2348;
        int count=0;
        while(n>0){
            n=n/10;
            count++;

        }
        System.out.println(count);





    }
}
