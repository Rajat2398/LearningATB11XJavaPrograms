package ex_07_If_Conditions;

public class Lab081_If_Else {
    public static void main(String[] args) {
        int age= Integer.parseInt(args[0]);//need to add arguments in CLI


        if (age>18){

            System.out.println("You can go to goa");

        }
        else {
            System.out.println("You can't got to goa");
        }
    }
}
