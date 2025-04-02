package ex_17_OOPs_Constructor;

public class Lab176_DC_JAVA {
    public static void main(String[] args) {

        car c1= new car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        System.out.println("  ----   ");
        car c2= new car();
        System.out.println(c2.name);
        System.out.println(c2.year);
        System.out.println(c2.model);
    }

}
class car{

    String name;
    int year;
    String model;



    //DC
car(){
    name= "Unknown Car";
    year=1995;
    model="XUV";

}

}