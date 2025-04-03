package ex_18_Inheritance.Multilevel_Inheritance;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Lab182_Multilevel {

    public static void main(String[] args) {




        Grandfather g1= new Grandfather();
      g1.gf();

        System.out.println("---");
      Father f1= new Father();
      f1.f();
      f1.gf();

        System.out.println("---");
        Son s1= new Son();
        s1.s();
        s1.f();
        s1.gf();


    }
}
