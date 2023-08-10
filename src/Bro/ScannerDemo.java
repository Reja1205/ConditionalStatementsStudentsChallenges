package Bro;


import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
       String name= sc.nextLine();
        System.out.println("How older are you?");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("What is your favorite food?");
        String food =sc.nextLine();
        System.out.println("My name is "+name);
        System.out.println("I am "+age +" years old");
        System.out.println("My favourite food is "+food);


    }
}
