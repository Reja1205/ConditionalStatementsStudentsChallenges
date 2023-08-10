package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        //Disolay type of website
        //http://amazon.com

        String url;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter url");
        url=sc.nextLine();
        String ext=url.substring(url.lastIndexOf(".")+1);

        switch(ext){
            case "com":
                System.out.println("commertial website");
                break;
            case"org":
                System.out.println("Organozational website");
                break;
            default:
                System.out.println("Invalid website");
                break;

        }
    }
}
