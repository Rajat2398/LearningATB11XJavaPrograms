package ex_28_Wrapper_Class;

public class Lab214_Wrapper_Conversion {

    public static void main(String[] args) {

        int a = 10;
        Integer b = a;//This boxing-> automatically JVM will store the value
        //Primitive to wrapper-> Autoboxing
        System.out.println(b.equals(10));//true
        System.out.println(b.equals(32));//false
        System.out.println(Integer.MAX_VALUE);//2147483647


        Integer a2 = 42;
        int v = a2;// Unboxing->Now wrapper is removed, attribute behaviour is lost
        System.out.println(v);//42

    }
}