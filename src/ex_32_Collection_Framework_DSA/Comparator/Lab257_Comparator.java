package ex_32_Collection_Framework_DSA.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab257_Comparator {

    public static void main(String[] args) {




        Student1 s1= new Student1(107,"Rajat",28);
        Student1 s2=new Student1(105,"Sharma",29);
        Student1 s3= new Student1 (101,"Lucky", 20);


        List<Student1> StudentList= new ArrayList();
        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);

        //Collections.sort(StudentList, new AgeComparator());
        Collections.sort(StudentList,new AgeComparator.NameComparator());
        System.out.println(StudentList);
        //Age-> [Student1{rollNo=101, name='Lucky', age=20}, Student1{rollNo=107, name='Rajat', age=28}, Student1{rollNo=105, name='Sharma', age=29}]
        //Name-> [Student1{rollNo=101, name='Lucky', age=20}, Student1{rollNo=107, name='Rajat', age=28}, Student1{rollNo=105, name='Sharma', age=29}]


    }




}


class AgeComparator implements Comparator<Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getAge()-o2.getAge();
    }

static class NameComparator implements Comparator<Student1>{


    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName());

    }
}

}
class Student1{




    private int rollNo;
    private String name;
    private int age;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




    public Student1 (int rollNo, String name, int age){
        this.rollNo= rollNo;
        this.name= name;
        this.age= age;

    }
}
