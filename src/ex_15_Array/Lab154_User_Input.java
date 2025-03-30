package ex_15_Array;

import java.util.Scanner;

public class Lab154_User_Input {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of array (int) only");
        int size= scanner.nextInt();


        int [] marks= new int[size];
        for (int i=0; i<marks.length;i++){

            System.out.println("Enter the marks");
            marks[i]= scanner.nextInt();

        }
        System.out.println("___");

        for (int i=0; i<marks.length;i++){
            System.out.println(marks[i]);


    }scanner.close();


    }
}
