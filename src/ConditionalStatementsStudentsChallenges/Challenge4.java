package ConditionalStatementsStudentsChallenges;

import java.util.Scanner;

public class Challenge4 {
    //Find radix of a number given in a string

    public static void main(String[] args) {
        String number;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number in a string");
        number=sc.nextLine();

        if(number.matches("[01]+")){
            System.out.println("Binary: Radix=2");
        }
        else if (number.matches("[0-9]+")){
            System.out.println("Decimal: radix=10");

        }
        else if(number.matches("[0-7]+")){
            System.out.println("Octal : radix =8");
        }
        else if (number.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal: radix =16");
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
