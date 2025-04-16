package ex_32_Collection_Framework_DSA.List;

import java.util.Stack;

public class Lab252_Stack {


    public static void main(String[] args) {
        //Stack
        //List In->First Out(LIFO)
        //Stack s= new Stack();

//        s.add("Rajat");
//        s.add("Sharma");
//        s.add("Lucky");


        Stack s= new Stack();
        s.push("Rajat");
        s.push("Sharma");
        s.push("Test");
        s.push("Test 2");
        System.out.println(s);//[Rajat, Sharma, Test, Test 2]

        System.out.println(s.size());//4
        System.out.println(s.peek());//Test 2-> Last element will appear
        System.out.println(s);
        System.out.println(s.pop());//Test 2-> Last element will appear and then will appear
        System.out.println(s);//[Rajat, Sharma, Test]


        System.out.println(s.size());//3
        System.out.println(s.empty());//false
        System.out.println(s.add("TESTER"));//true
        System.out.println(s);//[Rajat, Sharma, Test, TESTER]
        s.add("Test1");
        s.add("Test1");
        s.push("Tester2");
        System.out.println(s);//[Rajat, Sharma, Test, TESTER, Test1, Test1, Tester2]


    }
}
