package ex_04_TypeCasting;

public class Lab059_Narrowing {
    public static void main(String[] args) {


        int val=200;
       // byte b=val;//Invalid- Narrowing -Implicit Casting is not allowed
        byte b2=(byte)val;//Valid Narrowing- Explicit Casting
        //Data loss
    }
}
