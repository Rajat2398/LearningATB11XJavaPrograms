package ex_18_Inheritance.Multilevel_Inheritance;

public class Lab184_Multilevel {

    public static void main(String[] args) {

        Son amitr= new Son();
        amitr.f();
        amitr.gf();
        amitr.home();
        amitr.s();
        System.out.println(amitr.gold_gf);

        Father f1= new Father();
        f1.home();


        Grandfather gf1= new Grandfather();
        gf1.home();


        Grandfather grandfather= new Son();
        grandfather.home();//if home is not in Son then it will fetch data from  Father

    }
}
