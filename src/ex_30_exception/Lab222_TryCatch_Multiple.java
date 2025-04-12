package ex_30_exception;

public class Lab222_TryCatch_Multiple {

    public static void main(String[] args) {

        System.out.println("1");
        try {
           int  a= 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Hey buddy, its Try and Ctach");
        }

   catch (Exception e) {
        System.out.println("Hey buddy, its Try and Ctach");
    }
        System.out.println("2");
    }
}
