package ex_30_exception;

public class Lab219_String_NullPointer {

    public static void main(String[] args) {
        String name=null;
       name.trim();

        //java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
    }
}
