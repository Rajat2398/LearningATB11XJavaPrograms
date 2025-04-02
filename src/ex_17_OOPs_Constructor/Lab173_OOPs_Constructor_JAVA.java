package ex_17_OOPs_Constructor;

public class Lab173_OOPs_Constructor_JAVA {

    public static void main(String[] args) {

        baby b1= new baby();
        new baby();
        baby b2;

    }

}
class baby{

//Attributes
    String name;

//Behaviour
void cry(){

    System.out.println("crying");

}
void sleep(){
    System.out.println("sleeping");
}
void eat(){
    System.out.println("eating");
}

//Default Constructor

baby(){
    System.out.println("Default, and its constructor");

    //Fetch data form MYSQL DATABASE
    //Read data from CSV file
    // Open a fiel and read the data


}
}