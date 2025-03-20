package ex_08_Switch;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {


        //Switch
        //Take a user input and tell them the day which they have told
        // 1 to 7-> mon, 5-> Friday
        //8=? Not allowed or error

       //CLI OPTION-
        // int day= Integer.parseInt(args[0]);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter day sum (1 t0 7)");
        int day= scanner.nextInt();


        switch(day){


            case 1:
                System.out.println("Mon");
                break;

                case 2:
                System.out.println("Tue");
                break;
                case 3:
                System.out.println("Wed");
                break;
                case 4:
                System.out.println("Thu");
                break;
                case 5:
                System.out.println("Fri");
                break;
                case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
            break;
            default:
                System.out.println("Invalid entry");
                break;

        }


    }
}
