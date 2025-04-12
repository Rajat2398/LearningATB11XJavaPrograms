package ex_30_exception;

public class Lab229_JrQA_VS_SrQA2 {


    public static void main(String[] args) {

        //Jr.QA
        try {
            String ip = args[0];//java.lang.ArrayIndexOutOfBoundException
            int a = Integer.parseInt(ip);//NumberFormatException
            int b = 100 / a;//ArithmeticException


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
