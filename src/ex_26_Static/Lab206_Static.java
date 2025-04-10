package ex_26_Static;

public class Lab206_Static {
    public static void main(String[] args) {

        A ref1 = new A(10);
        ref1.displayvalue();
        //System.out.println(ref1.b);
        System.out.println(A.b);// becuase static belongs to Class
        A.b=45;



        System.out.println("---");

        A ref2= new A(20);
        ref2.displayvalue();
        //System.out.println(ref2.b);
        System.out.println(A.b);

        System.out.println("---");

        A ref3= new A(30);
        ref3.displayvalue();
        System.out.println(A.b);

    }


}
class A{

    int a;// non static->Instance Variables/properties/attirbutes
    static int b=20;


    A (int a){
        this.a=a;
    }

    void displayvalue(){
        System.out.println(this.a);
    }
}