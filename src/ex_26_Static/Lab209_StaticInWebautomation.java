package ex_26_Static;

import java.sql.SQLOutput;

public class Lab209_StaticInWebautomation {

    public static void main(String[] args) {

        Automation A1= new Automation();
        System.out.println(Automation.driver);


        Automation A2= new Automation();
        Automation A3= new Automation();
        System.out.println(A2.driver);
        System.out.println(A3.driver);
    }
}

class Automation{

    static String driver= "Chrome";

}