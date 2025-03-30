package ex_15_Array;

public class Lab151_Array_Creation {
    public static void main(String[] args) {
        String names[]={"Rajat","Test","Jio"};

        System.out.println(names.length);//3
        System.out.println(names[2]);//Jio
        System.out.println(names[1]);//Rajat
        System.out.println(names[0]);//Test



        String[] name=new String[3];
        name[0]="Rest";
        name[1]="True";
        name[2]="Aditi";

        System.out.println(name[0]);//Rest
        System.out.println(name[1]);//True
        System.out.println(name[2]);//Aditi


        boolean[] male_data= new boolean[2];
        male_data[0]=true;
        male_data[1]=false;
        System.out.println(male_data[1]);//false
        System.out.println(male_data[0]);//true
    }
}
