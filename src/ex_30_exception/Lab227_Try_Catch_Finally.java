package ex_30_exception;

public class Lab227_Try_Catch_Finally {
    public static void main(String[] args) {


        int a=1;
        int c=0;
        try {
            c=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always executed");
        }


    }
}
