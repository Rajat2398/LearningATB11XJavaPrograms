package ex_21_AccessModifier;

import org.w3c.dom.ls.LSOutput;

public class Lab193 {

}

class Father{


  private  int gold=10;
  protected  int  bhk3=11;

  int car=1;


}
class son extends Father{

    void getgold(){

        //System.out.println(gold);//Not allowed as private is used there
        System.out.println(bhk3);
        System.out.println(car);
    }

        }