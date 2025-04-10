package ex_26_Static;

public class Lab207_Static {
    public static void main(String[] args) {



        C.commonToAll();
        System.out.println(C.b);
        C c1_ref= new C();
        c1_ref.dispaly();
        System.out.println(c1_ref.a);
    }


}
class C{
    static {
        System.out.println("SIB Called -once, Class is loaded");
    }
    int a=10;
    static int b=10;

    void dispaly(){

        System.out.println("Non-static");
    }
    static void commonToAll (){
        System.out.println("Static");
        //System.out.println(a);//  //You cannot call instance variable in  the static method
    }



}