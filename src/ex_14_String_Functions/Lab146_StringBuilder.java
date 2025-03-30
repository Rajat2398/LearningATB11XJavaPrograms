package ex_14_String_Functions;

public class Lab146_StringBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder= new StringBuilder("Rajat");
        stringBuilder.append("Sharma");

        System.out.println(stringBuilder);//RajatSharma
        System.out.println(stringBuilder.reverse());//amrahStajaR
    }
}
