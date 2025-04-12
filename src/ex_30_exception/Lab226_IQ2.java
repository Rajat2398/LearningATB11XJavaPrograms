package ex_30_exception;

public class Lab226_IQ2 {


    public static void main(String[] args) {

        int c=0;
        int b=0;
        try {
            b=10/c;//Vunerable code that should be try and  catch
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
