package ex_12_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        //create a function of sub, sum, mul, and div
        //with parameter, a, b (take the parameter from the user)


        //Logic Building
        //Step- 1 Inputs and Outputs
        //a,b-> Int-> Scanner
        //int -> Variable Result->

        //Step 2-Rough Logic-> Create Functions
        //Function-type 4th- with return type and with parameters

        //Step 3-write the code and find and fix-> Edge cases


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a=0;
        if(scanner.hasNextInt()){
           a=scanner.nextInt();
        }else {
            System.out.println("Enter int only");
            System.exit(0);
        }


        System.out.println("Enter the second number");
        int b=0;
        if(scanner.hasNextInt()){
            b= scanner.nextInt();
        }else{
            System.out.println("Enter the int only");
            System.exit(0);
        }



        int r1= sum(a,b);
        int r2= sub(a,b);
        int r3= mul(a,b);
        int r4= div(a,b);
        int r5= mod(a,b);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);


    }


    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        if(b==0){
            System.out.println("Div by zero is not allowed");
            System.exit(0);
        }
        return a/ b;
    }

    static int mod(int a, int b){
        return a%b;
}}

