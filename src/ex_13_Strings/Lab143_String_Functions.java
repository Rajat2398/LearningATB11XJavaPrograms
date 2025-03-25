package ex_13_Strings;

import java.util.Locale;

public class Lab143_String_Functions {
    public static void main(String[] args) {

        String s="rajat";
        System.out.println(s.length());//5
        System.out.println(s.charAt(4));//t(start from 0)
        //System.out.println(s.charAt(10));//StringIndexOutOfBoundsException


        //2. concat
        System.out.println(s.concat("Sharma"));//rajatSharma


        //3. contains
        System.out.println(s.contains("Te"));//false

        //4. equals
        System.out.println(s.equals("rajat"));//true

        //5.euqualsIgnoreCase()
        System.out.println(s.equalsIgnoreCase("rajat"));//true

        //6. index of
        System.out.println(s.indexOf("a"));//1

        //returns the index within this string of the
        //first occurrence of the specified substring

        //7.Length
        System.out.println(s.length());//5



        //8.replace
        System.out.println(s.replace("r","R"));//Rajat

        //9. split function
        String name="rajats2398@gmail.@com";
        String[] split=name.split("@");

        System.out.println(split[0]);//rajats2398
        System.out.println(split[1]);//gmail.
        System.out.println(split[2]);//com


      //10. substring (,)
        System.out.println(s.substring(1,3));//aj

        //11.tolowercase
        System.out.println("RAJAT".toLowerCase());//rajat

        //12.toUppercase
        System.out.println("rajat".toUpperCase());//RAJAT

        //13. startwith()
        System.out.println(s.startsWith("T"));//false

        //14.endswith()
        System.out.println(s.endsWith("a"));//false


        //15.trim()
        String name1= "      Rajat qwjkbwq   ";
        System.out.println(name1.trim());//Rajat qwjkbwq-> it will trim the starting end ending space


        //16.compareTo()
        System.out.println(s.compareTo("rajat"));//0

        //17. compareToIgnorecase()
        System.out.println(s.compareToIgnoreCase("rajat"));//0


        StringBuilder stringBuilder= new StringBuilder("rajat");
        System.out.println(stringBuilder);

        StringBuilder sb= new StringBuilder("Sharma");
        System.out.println(sb.toString());

        String anotherPalindrome= "Text area true not ";
        String area= anotherPalindrome.substring(5,9);
        System.out.println(area);//area

//        StringBuffer stringBuffer= new StringBuffer("rajat");
//        System.out.println(stringBuffer);

        String s11="rajat";
        String s22=s11.concat("sharma");
        System.out.println(s22);//rajatsharma

       //concat by (+)

        String a="Rajat";
        String b=" Sharma";
        String c= a+b;
        System.out.println(c);//Rajat Sharma


        //
        String n= "RajatSharma";
        System.out.println(n.indexOf("a"));//1
        System.out.println(n.lastIndexOf("a"));//10

    }
}
