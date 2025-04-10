package ex_26_Static;

public class Lab205_Static_IIB {

    public static void main(String[] args) {


        B a= new B();
        //Whne call the class-then SIB Will be called
        //When call the object-Then IIB and DC will be called.


        B a1= new B();
        B a2= new B();
        //IIB and DC-> it will call total 3 times--->Based on Objects
        //SIB-> It will call only 1 time---> Based on class

    }

}
class B{

    B()
    {
        System.out.println("DC");
    }
    {
        System.out.println("HI, IIB");
    }

    static {
        System.out.println("Its Static- SIB");
    }
}