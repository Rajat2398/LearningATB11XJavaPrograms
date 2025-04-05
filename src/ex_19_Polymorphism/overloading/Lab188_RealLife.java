package ex_19_Polymorphism.overloading;

public class Lab188_RealLife {

    public static void main(String[] args) {


        Home h1= new Home();
        h1.task(5);
        h1.task(5,7);
        h1.task(4,7,9);
    }
}


class Home{

    void task(int a){

        System.out.println(a);
    }

    void task(int a, int b){
        System.out.println(a+b);
    }

    void task(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
