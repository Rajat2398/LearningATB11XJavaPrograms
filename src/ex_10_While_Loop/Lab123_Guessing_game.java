package ex_10_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab123_Guessing_game {
    public static void main(String[] args) {
        //Guess a number between 1 and 10


        Random random=new Random();
        int numbertoGuess=random.nextInt(10)+1;
        System.out.println(numbertoGuess);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempts=0;
        while(true){


            guess= scanner.nextInt();
            attempts++;

            if(guess<numbertoGuess){
                System.out.println("Too low try again");
            }else if(guess>numbertoGuess){
                System.out.println("Too Hign Try again");
            }else{
                System.out.println("Correct " +attempts+ "attempts" );
                break;
            }

        }

    }
}
