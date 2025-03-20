package ex_07_If_Conditions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab082_If_Else_P2 {
    public static void main(String[] args) {

        //Allowed to vote or Not
        //If age>18 ->Allowed to vote
        //else age <>18 ->not allowed to vote


        //How to take the user input
        //1.Cli Options
        //
         // int age= Integer.parseInt(args[0]);

        //Scanner Class
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scanner.nextInt();
        System.out.println(age);


        if(age>18)
        {
            System.out.println("You are allowed to vote");
        }
        else
        {
            System.out.println("Not allowed to vote");
        }

    }
}
