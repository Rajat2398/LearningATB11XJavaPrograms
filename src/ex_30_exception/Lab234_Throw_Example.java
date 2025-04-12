package ex_30_exception;

import java.util.Scanner;

public class Lab234_Throw_Example {


    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static void validateAge(int age)  throws Exception{

        if (age < 18) {
            throw new Exception("Age can't <18");

            //throw new NotvalidateageException("Not a valid age");
        }

    }

}
