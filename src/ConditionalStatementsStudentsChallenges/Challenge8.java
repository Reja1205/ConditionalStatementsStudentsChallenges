package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        //Find type of website and the protocol used
//http:www.google.com
        String url;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a url");
        url = sc.nextLine();

        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("Hyper text transfer protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File transfer protocol");
        }

        String ext=url.substring(url.lastIndexOf(".")+1);
        if (ext.equals("com")){
            System.out.println("Commertial website");
        }
        else if(ext.equals("org")){
            System.out.println("organizational website");
        }


    }
}



