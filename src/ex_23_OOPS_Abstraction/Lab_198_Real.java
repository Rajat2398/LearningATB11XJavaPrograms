package ex_23_OOPS_Abstraction;

public class Lab_198_Real {



}
abstract class Employee{



    private  String name;
    private String address;
    private int number;


    Employee(){


    }


    Employee(String name, String address, int number){
        System.out.println("Construction of an employee!");
        this.address= address;
        this.name= name;
        this.number= number;
    }
    abstract double computePay();

        void mailcheck() {
            System.out.println("Mailing a check to"+ this.name+ " "+ this.address+ " " +this.number);

        }

        }

        class c1 extends Employee{

            @Override
            double computePay() {
                return 0;
            }
        }
