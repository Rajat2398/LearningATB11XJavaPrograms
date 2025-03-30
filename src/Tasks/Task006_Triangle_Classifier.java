package Tasks;

import java.util.Scanner;

public class Task006_Triangle_Classifier {
    public static void main(String[] args) {



        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1= scanner.nextInt();

        System.out.println("Enter the side 2");
        int side2= scanner.nextInt();

        System.out.println("Enter the side 3");
        int side3= scanner.nextInt();




        if(side1<=0 || side2<=0 ||  side3<=0){

            System.out.println("This is not a Triangle");
            System.exit(0);

        }
        if (side1 + side2 <=side3 || side2+side3 <=side1 || side1 + side3 <=side2){

            System.out.println("This is not a Triangle");
            System.exit(0);

        }

        //Real Logic

        if (side1==side2 && side2==side3){


            System.out.println("Equilateral Triangle");
        }else if (side1==side2|| side2==side3|| side3==side1){
            System.out.println("Isoceles Triangle");

        }else{
            System.out.println("Scalene");
        }
        scanner.close();
    }
}
