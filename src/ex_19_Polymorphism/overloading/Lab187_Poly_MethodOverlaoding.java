package ex_19_Polymorphism.overloading;

public class Lab187_Poly_MethodOverlaoding {
    public static void main(String[] args) {

        MathOperations M1= new MathOperations();

        int r1=M1.add(2,5);
        int r2= M1.add(3,6,7);
        double r3= M1.add(3.14,4.65);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }


}
class MathOperations{

    //In the same class when you have method with same
    //name but different argument and different return type


    int add(int a, int b){

        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
}