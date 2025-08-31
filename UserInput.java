import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Scanner  (in JAVA) is the like scanf(in C) to take the input from the user.
//        input is identifier.
        System.out.println("Please enter your name below:-");
        String name =input.nextLine();        System.out.println("Hello "+ name);
//        String Concatenation :- Two strings added by (+) .
//        "nextLine" :- It take input in the form of string by the user.
        System.out.println(name + ", Please tell me your AGE");
        int age = input. nextInt();
        System.out.println("Ok Gaurav");


    }
}
