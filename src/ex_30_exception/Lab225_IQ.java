package ex_30_exception;

public class Lab225_IQ {


    public static void main(String[] args) {

        try {
        String input_user=args[0];//java.lang.ArrayIndexOutOfBoundException
        int a= Integer.parseInt(input_user);//if provided the argument as string then //java.lang.NumberFormatException

            int output=100/a;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException|NumberFormatException e) {
           // NumberFormatException n1= new NumberFormatException();-> We are not using because JVM is creating object

            System.out.println(e.getMessage());
        }

    }
}
