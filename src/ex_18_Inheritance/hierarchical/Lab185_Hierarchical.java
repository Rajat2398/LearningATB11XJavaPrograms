package ex_18_Inheritance.hierarchical;

public class Lab185_Hierarchical {
    public static void main(String[] args) {

//hierarchical- Multiple derived classes from a single base class

        father f1= new father();
        Ruhani r1= new Ruhani();

        r1.home();
        f1.home();


        Rajat R= new Rajat();
        R.home();

        Lucky l1= new Lucky();
        l1.l2();
        l1.home();
    }


}

class father{

    void home(){

        System.out.println("3BHK");
    }

}
class Rajat extends father{
    void h2(){

        System.out.println("h2-Rajat");
    }


}
class Lucky extends father{
    void l2(){
        System.out.println("l2-Lucky");

    }

}
class Ruhani extends father{
    void r1(){
        System.out.println("r1-Ruhani");

    }

}
