package ex_13_Strings;

public class Lab141_IQ_2 {
    public static void main(String[] args) {

        String s1= "Hello";
        String s4="Hello";//SCP->2

        String s2= new String("Hello");
        String s3= new String("Hello");
        String s5= new String("hello");// OA-> 3



        //==-> Comparison-> String-> This check the location reference
        System.out.println(s1==s3);//false
        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//false

        System.out.println(s1==s4);//true

        //equals->Content

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equalsIgnoreCase(s5));//as Hello(s3) and hello (s5) in



        //== checks for reference
        //=assignment the value
    }
}
