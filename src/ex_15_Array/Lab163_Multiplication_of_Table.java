package ex_15_Array;

import java.util.Scanner;

public class Lab163_Multiplication_of_Table {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Size ");
        int Size_Of_The_Table= scanner.nextInt();


        for (int i=0; i<Size_Of_The_Table;i++){
            for (int j = 0; j <Size_Of_The_Table ; j++) {

                System.out.print(i + "x"+ j + "=" + (i*j)+"\t\t");
                System.out.print(i*j);

            }
            System.out.println();


        }
    }
}
