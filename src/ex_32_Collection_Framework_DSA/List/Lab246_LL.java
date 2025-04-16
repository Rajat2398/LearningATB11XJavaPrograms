package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LL {
    public static void main(String[] args) {

        List mylist= new ArrayList(5);
        List mylist0= new ArrayList();//Array Format


        List mylist2= new LinkedList();//Doubly Linked List


        mylist2.add("rajat");//0
        mylist2.add("ravi");//1
        mylist2.add("Text");//2
        mylist2.add("Test");//3
        mylist2.add("True");//4
        mylist2.add("True");//5
        mylist2.add(null);//6
        mylist2.add(true);//7
        mylist2.add(123);//8
        System.out.println(mylist2);//rajat, ravi, Text, Test, True, True, null, true, 123]

        System.out.println(mylist2.isEmpty());//false
        System.out.println(mylist2.size());//9
        System.out.println(mylist2.contains("rajat"));//true
        System.out.println(mylist2.indexOf("Test"));//3

    }
}
