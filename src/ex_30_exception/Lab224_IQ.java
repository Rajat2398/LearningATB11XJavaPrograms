package ex_30_exception;

public class Lab224_IQ {


    public static void main(String[] args) {
        try {
        String s1= null;
        s1.trim();
        int a=10/0;


        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());

        }
        catch (Exception e) {
            System.out.println(e.getMessage());

    }
}
}
