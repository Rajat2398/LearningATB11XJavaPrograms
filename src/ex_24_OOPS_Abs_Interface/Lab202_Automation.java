package ex_24_OOPS_Abs_Interface;

public class Lab202_Automation {

}



class ConcreteClass implements Incomplete_interface{

    @Override
    public void display() {
        System.out.println("Hi");
    }
}
interface Incomplete_interface{

    int a=10;
    void display();

}