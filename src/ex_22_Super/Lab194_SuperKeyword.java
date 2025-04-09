package ex_22_Super;

public class Lab194_SuperKeyword {

    public static void main(String[] args) {


        car c1 = new car();
        c1.display();
    }


}


class Vehicle{
 public int maxspeed=100;

 Vehicle(){
     System.out.println("Default Const");

 }

 Vehicle (int a){
     System.out.println("param constructor");


 }

 void message(){

     System.out.println("No return, No argument");
 }

 void message(int a){
     System.out.println("PC- Argument");
 }

 void display(){
     System.out.println("Vehicle-Parent");
 }



}


class car extends Vehicle{

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    private int maxspeed=281;

    car(){

        super();//DC


    }
car (int a){
        super(25);//Parameterized constructor of parent


}

    @Override
    void display() {


        System.out.println(this.maxspeed);

        //Parent
        System.out.println(super.maxspeed);
        super.message();
        super.display();
        super.message(25);
        System.out.println("Override");
    }
}
//super keyword is used to use the method, variables of paraent calss in child
