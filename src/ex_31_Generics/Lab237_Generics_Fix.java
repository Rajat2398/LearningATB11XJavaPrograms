package ex_31_Generics;

public class Lab237_Generics_Fix {
    public static void main(String[] args) {

        temp_sum(3,5);
        temp_sum(3.24,5.67);
        temp_sum("Rajat","Sharma");

    }
//we can use any placeholder instead of T.
    static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;

    }
}
