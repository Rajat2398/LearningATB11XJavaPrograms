package ex_17_OOPs_Constructor;

public class Lab179_Constructor_Overloading {

    public static void main(String[] args) {

            ex_17_OOPs_Constructor.person p1= new ex_17_OOPs_Constructor.person("Kota", 34424L,"Rajat");
            ex_17_OOPs_Constructor.person p2= new ex_17_OOPs_Constructor.person("Noida",4516451L,"Test");

            ex_17_OOPs_Constructor.person p3=new ex_17_OOPs_Constructor.person();

            p1.eat();//Rajat
            p2.eat();//Test
            p3.eat();//null

            ex_17_OOPs_Constructor.person p4= new ex_17_OOPs_Constructor.person(325223552L,"Lucky");
            p4.eat();
        }
    }
    class person1{

        String address;
        long phone;
        String name;

        person1(){


        }

        person1(String address_args,
               long phone_args,
               String name_args){

            this.name=name_args;
            this.address=address_args;
            this.phone=phone_args;

        }
        person1(long phone_args, String name_args){

            this.name=name_args;
            this.phone=phone_args;

        }
        void eat(){
            System.out.println(this.name + "  is eating");
        }


    }

