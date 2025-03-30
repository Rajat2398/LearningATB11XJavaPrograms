package Tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task011_Palindrome {
    public static void main(String[] args) {

        //Array of Chars


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Input for Palindrome");
        String userInput=sc.next();

        String newString= reverseString(userInput);
         if (newString.equalsIgnoreCase(userInput)){
            System.out.println("Its palindrome");
         }else{

             System.out.println("Not a Palindrome");
         }
    }

    private static String reverseString(String userInput) {
        String reversed= " ";



        for(int i= userInput.length() -1;i>=0;i--){
            reversed= reversed+userInput.charAt(i);

        }
        return reversed;
    }

    private static String reverseStringSB(String userInput){

StringBuilder stringBuilder= new StringBuilder(userInput);
return stringBuilder.reverse().toString();

    }
}
