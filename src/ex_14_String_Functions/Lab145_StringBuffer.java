package ex_14_String_Functions;

public class Lab145_StringBuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer= new StringBuffer("Rajat");
        stringBuffer.append("Sharma");
        System.out.println(stringBuffer);//RajatSharma
        System.out.println(stringBuffer.reverse());//amrahStajaR


        String s1= "Rajat";
        String s2="Sharma";
        String s3=s1+s2;

        System.out.println(s3);//creates a new string so total will be 3 "RajatSharma"
        System.out.println(s1);
    }
}
