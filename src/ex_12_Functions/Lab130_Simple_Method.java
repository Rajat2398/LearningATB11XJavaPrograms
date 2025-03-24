package ex_12_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {


        int result=return_int();
        System.out.println(result);

        boolean result1= return_boolean();
        System.out.println(result1);

    }
    static void rajat_f1(){
        System.out.println("No Return");
    }
    static int return_int(){
        return 25;
    }
    static  boolean return_boolean(){
        return true;

    }
    static float return_pi(){
        return 3.14f;
    }
    static byte return_byte(){
        return 100;
    }
    static long return_long(){
        return 45555L;
    }
    static String return_String(){
        return "Rajat";
    }
}
