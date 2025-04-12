package ex_30_exception;

public class Lab223_TryCatch_IQ {

    public static void main(String[] args) {

        System.out.println("1");
        try {
           int  a= 10/0;
        }
        catch (Exception e) {
       System.out.println("Hey buddy, its Try and Ctach");
    }
        //Not possible as big exception used before
//        catch (ArithmeticException e) {
//            System.out.println("Hey buddy, its Try and Ctach");
//        }
        System.out.println("2");
    }
}
