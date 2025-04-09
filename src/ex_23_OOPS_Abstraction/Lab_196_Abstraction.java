package ex_23_OOPS_Abstraction;

public class Lab_196_Abstraction {
    public static void main(String[] args) {
         child c= new child();
         c.loan50k();
         c.loan25k();

         //Father f1= new Father();//Not possible
         Father f2= new child();
    }


}
