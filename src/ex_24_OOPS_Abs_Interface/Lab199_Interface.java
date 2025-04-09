package ex_24_OOPS_Abs_Interface;

public class Lab199_Interface {


    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.getArea(4,7);



        Square s1= new Square();
        s1.getArea(3,6);
    }
}



interface Polygon{

void getArea(int length, int breath);

}
class Square implements Polygon{


    @Override
    public void getArea(int length, int breath) {
        System.out.println("The area of square is "+ " "+ (3.14*length*breath));//for example
    }
}
class Rectangle implements Polygon {

    @Override
    public void getArea(int length, int breath) {
        System.out.println("The area of rectangle is " + " "+(length* breath));

    }



}
