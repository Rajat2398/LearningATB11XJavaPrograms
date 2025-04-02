package ex_17_OOPs_Constructor;

public class Lab177_Parameterized_Constructor {

    public static void main(String[] args) {

        car2 c1= new car2();
        car2 c2= new car2();
        System.out.println(c1.name);
        System.out.println(c2.name);


        car2 c3= new car2("Tesla",2015,"Model3");
        System.out.println(c3.name);

        car2 c4= new car2("Mahindra",2020,"ScorpioN");
        System.out.println(c4.name);
    }

}
class car2 {

    String name;
    int year;
    String model;


    //DC
    car2() {
        name = "Unknown Car";
        year = 1995;
        model = "XUV";
        System.out.println("DC");

    }

    //Parameterzied Constructor
    car2(String name, int year, String model){

        this.name= name;
        this.year= year;
        this.model= model;           //this-> Accessing Instance Variable and Distinguis Instance variable form parameteres

    }


}