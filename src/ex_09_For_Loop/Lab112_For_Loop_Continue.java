package ex_09_For_Loop;

public class Lab112_For_Loop_Continue {
    public static void main(String[] args) {

        for (int i=0; i<50;i++){
         if (i==5){
             continue;//skip below code and move to top; it means it will skip the 5
         }
            System.out.println(i);

        }
    }
}
