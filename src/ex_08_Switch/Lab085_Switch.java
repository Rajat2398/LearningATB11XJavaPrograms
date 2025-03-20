package ex_08_Switch;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab085_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day sum (1 t0 7)");
        int day = scanner.nextInt();


        switch (day) {


            case 1:
                System.out.println("Mon");


            case 2:
                System.out.println("Tue");
        }
    }
}

