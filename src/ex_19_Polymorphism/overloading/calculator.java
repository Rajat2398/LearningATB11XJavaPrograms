package ex_19_Polymorphism.overloading;

public class calculator {


    public int add(int a, int b) {
        return a + b;

    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {


        calculator c1= new calculator();
        c1.add(4,5);
        c1.add(4.6,7.8);

    }
}
