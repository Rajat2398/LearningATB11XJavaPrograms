package ex_30_exception;

public class Lab217_Exception_Explained {


    public static void main(String[] args) {


        System.out.println("Starting the program");
        String input_user=args[0];//java.lang.ArrayIndexOutOfBoundException
        int a= Integer.parseInt(input_user);//if provided the argument as string then //java.lang.NumberFormatException
        int output=100/a;//java.lang.ArithmeticException:/by zero
        System.out.println(output);//25 because I provided the argument by CLI option as 4
        System.out.println("End of the program");


//These are unchecked exception-these will occur at run time
        //java.lang.ArrayIndexOutOfBoundException
        //if provided the argument as string then //java.lang.NumberFormatException
        //java.lang.ArithmeticException:/by zero




    }
}
