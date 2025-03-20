package Tasks;

import java.util.Scanner;

public class Task005_Even_Odd_IF {
    public static void main(String[] args) {
        //Create a program
        //take user input &
        //Check weather the input even or odd


        Scanner scanner= new Scanner(System.in);
        System.out.println("Number");
        int number= scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("ODD");
        }

    }
}
