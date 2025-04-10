package ex_25_IIB;

public class Lab203_IIB {

    //IIB
    //Instance Initialization Block
    //I will be executed when Object is created

    public static void main(String[] args) {

        A a= new A();
    }

}

class A{

    A(){
        System.out.println("DC");
    }
    {
        System.out.println("Hi, i am IIB");
        System.out.println("If you want to execute or call something when object is created");
        //my sql connection
        //read a csv file
        //read a JSON FILE, XML FILE
        //read a text file or env file



    }
    {
        System.out.println("Ho, I am IIB 2");
    }
}



