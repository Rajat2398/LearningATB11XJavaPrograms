package ex_30_exception;

public class Lab221_TryCatch {

    public static void main(String[] args) {

        System.out.println("1");
        try {
           int  a= 10/0;
        } catch (Exception e) {
            System.out.println("Hey buddy, its Try and Ctach");
        }
        System.out.println("2");
    }
}
