package ex_22_Super;

public class Lab_195_Super {

    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.display();
         Animal A1= new Animal();
         A1.sound();
    }
}


class  G1{


    void sound(){
        System.out.println("sound");
    }

}
class Animal  extends G1{

    protected String colour = "White";


    void sound(){

        System.out.println("Animal Sound");
        super.sound();//sound

    }

}





class Dog extends Animal{
    private String colour="Black";


    void display(){

        System.out.println(this.colour);//Black
        System.out.println(super.colour);//White
        super.sound();//Animal Sound

    }
}