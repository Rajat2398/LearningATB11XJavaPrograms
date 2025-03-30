package ex_15_Array;

public class Lab149_Array {
    public static void main(String[] args) {

        int a=10;
        int [] marks ={23,66,75,74,38,89};

        System.out.println(marks.length);//6
        System.out.println(marks[4]);//38
        System.out.println(marks[3]);//74
        //System.out.println(marks[-2]);//.ArrayIndexOutOfBoundsException

        boolean[] working={true,false, false, true};
        System.out.println(working[3]);//true
    }
}
