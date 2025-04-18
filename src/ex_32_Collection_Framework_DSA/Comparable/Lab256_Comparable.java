package ex_32_Collection_Framework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab256_Comparable {
    public static void main(String[] args) {

        Student s1= new Student(107,"Rajat",28);
        Student s2=new Student(105,"Sharma",29);
        Student s3= new Student (101,"Lucky", 20);


        List<Student> studentList= new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);


        Collections.sort(studentList);
        System.out.println(studentList);
        //rollNo->[Student{rollNo=101,name=Lucky,age=20}, Student{rollNo=105,name=Sharma,age=29}, Student{rollNo=107,name=Rajat,age=28}
        //age-> [Student{rollNo=101,name=Lucky,age=20}, Student{rollNo=107,name=Rajat,age=28}, Student{rollNo=105,name=Sharma,age=29}]
        // name-> [Student{rollNo=101,name=Lucky,age=20}, Student{rollNo=107,name=Rajat,age=28}, Student{rollNo=105,name=Sharma,age=29}]


    }
}

 class Student implements  Comparable<Student>{

     private int rollNo;
     private String name;
     private int age;

     public Student (int rollNo, String name, int age){
         this.rollNo= rollNo;
         this.name= name;
         this.age= age;

     }

     @Override
    public String toString(){
         return "Student{" +
                 "rollNo=" +rollNo+
                 ",name=" + name+
                 ",age="+ age+
                 '}';



     }

//     @Override
//     public int compareTo(Student o) {
//         return this.rollNo-o.rollNo;
//     }


     @Override
     public int compareTo(Student o){
         return this.age-o.age;
     }

//     @Override
//
//     public int compareTo(Student o){
//         return this.name.compareTo(o.name);
//     }
 }


