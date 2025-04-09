package ex_23_OOPS_Abstraction;

public class Lab_196_AB_Car {

    public static void main(String[] args) {


        wagnor car= new wagnor();
        car.drive();
    }

}
abstract class Engine{


    abstract void startEngine();
    abstract void stopEngine();


    void normal(){
        System.out.println("Normal function");
    }
}

class wagnor extends Engine{


    @Override
    void startEngine() {
        System.out.println("Starting the car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the car");
    }
   void drive(){

        startEngine();
        stopEngine();
   }


}//Complete class-> No Abstarct Method