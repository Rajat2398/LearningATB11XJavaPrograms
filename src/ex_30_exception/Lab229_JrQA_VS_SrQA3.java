package ex_30_exception;

public class Lab229_JrQA_VS_SrQA3 {


    public static void main(String[] args) {

        //Sr.QA

        try {
            String ip = args[0];//java.lang.ArrayIndexOutOfBoundException
            int a = Integer.parseInt(ip);//NumberFormatException
            int b = 100 / a;//ArithmeticException
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }
}
