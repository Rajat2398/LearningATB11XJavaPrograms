package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab253_Students_AL {
    public static void main(String[] args) {

        student s1= new student("23","rajat");
        student s2= new student("24","Sharma");
        student s3= new student("25","new");

        List<student> mystudent= new ArrayList<>();

        mystudent.add(s1);
        mystudent.add(s2);
        mystudent.add(s3);

        System.out.println(mystudent);

        s1.printdetails();
        s2.printdetails();
        s3.printdetails();



    }
}
