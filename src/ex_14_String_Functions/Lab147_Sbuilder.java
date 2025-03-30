package ex_14_String_Functions;

public class Lab147_Sbuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.reverse();
        System.out.println(sb);//dlroWolleH


        sb.delete(4,8);
        System.out.println(sb);//dlroeH

        sb.replace(0,4,"Hi");
        System.out.println(sb);//HieH

    }
}
