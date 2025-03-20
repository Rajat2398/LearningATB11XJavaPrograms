package ex_08_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch {
    public static void main(String[] args) {

//        String browser= args[0];
//        System.out.println(browser);

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the name of browser");
        String browser= scanner.next();

        switch (browser){

            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("Tc1");
                System.out.println("Tc2");
                System.out.println("Tc3");

                break;
            case "edge":
                System.out.println("Test for Edge browser");
                break;

            case "Firefox":
                System.out.println("Firefox code");

            default:
                    System.out.println("Not any browser");
                    break;


        }
    }
}
