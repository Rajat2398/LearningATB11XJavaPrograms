package ex_17_OOPs_Constructor;

public class Lab178_PC_Real {

    public static void main(String[] args) {

        person p1= new person("Kota", 34424L,"Rajat");
        person p2= new person("Noida",4516451L,"Test");

        person p3=new person();

        p1.eat();//Rajat
        p2.eat();//Test
        p3.eat();//null

        person p4= new person(325223552L,"Lucky");
        p4.eat();
    }
}
class person{

    String address;
    long phone;
    String name;

    person(){


    }

    person(String address_args,
    long phone_args,
    String name_args){

        this.name=name_args;
        this.address=address_args;
        this.phone=phone_args;

    }
person(long phone_args, String name_args){

        this.name=name_args;
        this.phone=phone_args;

    }
    void eat(){
        System.out.println(this.name + "  is eating");
    }


}