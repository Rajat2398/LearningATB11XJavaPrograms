package Tasks;

import java.util.Scanner;

public class Task004_CLI_Options {
    public static void main(String[] args) {


        //Take a user input -Name, Age and Salary and print  them in the end
        //
         //take a user input 2 numbers from the arguments and calculate the maximum
        System.out.println("enter user details");
//        String Name=args[0];
//        int Age =Integer.parseInt(args[1]);
//        double Salary=Double.parseDouble(args[2]);
//        //String Name=args[0];
//       // String Age= args[1];
//        //String Salary= args[2];
//        System.out.println(Name);
//        System.out.println(Age);
//        System.out.println(Salary);

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the name");
        String Name= scanner.nextLine();


        System.out.println("Enter the Age");
        int age= scanner.nextInt();

        System.out.println("Enter the salary");
        double salary= scanner.nextDouble();

        //Print the collected Information
        System.out.println("Name is :" + Name);
        System.out.println("Age is : "  + age);
        System.out.println("Salary is :"+ salary);

        //close the scanner
        scanner.close();


    }
}
