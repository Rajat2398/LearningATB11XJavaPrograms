package ex_23_OOPS_Abstraction;

abstract class Father {


    abstract void loan50k();

    void loan25k() {
        System.out.println("Given 25K");
    }
}
class child extends Father{


    @Override
    void loan50k() {
        System.out.println("Child will pay 50k loan");
    }
}