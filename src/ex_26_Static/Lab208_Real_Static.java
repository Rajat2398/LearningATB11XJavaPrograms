package ex_26_Static;

import java.sql.SQLOutput;

public class Lab208_Real_Static {
    public static void main(String[] args) {



        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);

        ATB.do_assignment();
        ATB.joinzoomforclass();

        ATB amit= new ATB();
        amit.setName("amit");
        amit.setPhone("5738267");


        ATB lucky= new ATB();
        amit.setName("lucky");
        amit.setPhone("6575644");



    }



}
class ATB{

    static{
        System.out.println("Load the class-I will execute");

    }
    {
        System.out.println("IIB-This is called when object is created");

        //What is purpose
        //Here you can write the code related to start a website or anything before starting the
        //web automation or api automation

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;//Non-Static
    private String phone;
    static String courseName="ATB11X";
    static String mentorName="Pramod";



    static void do_assignment(){
      //  System.out.println(phone);//static method can't access not static
        System.out.println("Do Assignmnet");
    }

    static void joinzoomforclass(){
        System.out.println("Class Joined");
    }


    void howTheyAssignment(){
        System.out.println("It is different");
    }
}