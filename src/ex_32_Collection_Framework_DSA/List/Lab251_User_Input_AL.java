package ex_32_Collection_Framework_DSA.List;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab251_User_Input_AL {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Integer> ages= new ArrayList<>();


        String continueInput="Y";//Control variable for input loop

        while(continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter the name");
            String name= scanner.next();
            names.add(name);

            System.out.println("Enter the age");
           Integer age= scanner.nextInt();
           ages.add(age);


           scanner.nextLine();
            System.out.println("do you want to enter another record? (Y/N) :");
            continueInput= scanner.nextLine();



        }

        for(Object o1:names){
            System.out.println(o1);
        }
        for(Object o2: ages){
            System.out.println(o2);
        }
        scanner.close();
    }
}
