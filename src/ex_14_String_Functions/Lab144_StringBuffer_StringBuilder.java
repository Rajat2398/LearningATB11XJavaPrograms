package ex_14_String_Functions;

public class Lab144_StringBuffer_StringBuilder {

    public static void main(String[] args) {

        String s1="Rajat";
        String s2= new String("Rajat");


        StringBuffer stringbuffer= new StringBuffer("Rajat");
        StringBuilder stringBuilder= new StringBuilder("Rajat");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringbuffer);
        System.out.println(stringBuilder);



    }
}
