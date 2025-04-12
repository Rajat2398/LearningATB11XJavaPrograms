package ex_30_exception;

public class Lab230_IQ {
    public static void main(String[] args) {

        final Double pi=3.14;
        int a=0;
        try {
            int x=10/a;
        } catch (Exception e) {
            System.out.println("Div by zero");
        }finally {
            System.out.println("It will print Anyhow!");
        }

    }
}
