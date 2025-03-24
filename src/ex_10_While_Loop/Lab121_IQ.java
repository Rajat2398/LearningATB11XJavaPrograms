package ex_10_While_Loop;

import java.util.Scanner;

public class Lab121_IQ {
    public static void main(String[] args) {
        //Factorial Program


        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to factorial Program \nenter the number whose factorial you want");
        int number= scanner.nextInt();



        int factorial=1;
        if(number<=0){
            System.out.println(factorial);
        }
        else{

            for (int i=1;i<=number;i++){

   factorial=factorial*i;

            }
        }
        System.out.println("Factorial is->" + factorial);
    }
}
