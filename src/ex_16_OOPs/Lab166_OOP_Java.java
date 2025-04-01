package ex_16_OOPs;

public class Lab166_OOP_Java {
    public static void main(String[] args) {

        person amit;

        //person-> clss
        //p2-> Object reference
        //new person()-> object

        person p2= new person();
        p2.name="Lucky";
        System.out.println(p2.name);


        person p3= new person();
        p3.name="rajat";
        System.out.println(p3.name);
    }
}
class person{
//Attribytes| Properties| Data Members
    String name;
    String phone;
    String colour_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean is_male;

//behaviour| Function| Method

    void sleep(){
        System.out.println("I am Sleeping");
    }
    String greet (String name){
        return "Hello" + name;
    }
    void talk(){

    }
    int remaining_amount_salary(int salary, int tax){
        return salary-tax;
    }
}