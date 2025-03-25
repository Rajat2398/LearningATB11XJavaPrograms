package ex_13_Strings;

public class Lab135_Strings_Immutable {
    public static void main(String[] args) {

        String name="rajat";
        name.toUpperCase();
        System.out.println(name);//rajat

        String name1="rajat";
        name1=name1.toUpperCase();
        System.out.println(name1);//Rajat-> need to assign
    }
}
