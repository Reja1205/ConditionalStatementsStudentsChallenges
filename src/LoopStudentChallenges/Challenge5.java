package LoopStudentChallenges;

public class Challenge5 {
    //5.	Count digits of a number in seperate line
    public static void main(String[] args) {
        int n=257;
        while(n>0){
            int r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}
