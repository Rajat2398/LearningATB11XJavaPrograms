package ex_28_Wrapper_Class;

public class Lab216_Wrapper {
    public static void main(String[] args) {

        Mobile Iphone= new Mobile(1,"Pro Max",120000.00);
        Mobile Samsung = new Mobile(2,"Ultra",100000.00);


        Iphone.setPrice(200000.98);
        System.out.println(Iphone.getPrice());
        Iphone.display();
        Samsung.display();

        System.out.println(Mobile.mobile_carrier);

        Mobile.switchon();//CommonToAll-> Because Static is used




    }
}


class Mobile extends old_phone{




    private Integer phone;
    private String name;
    private Double price;

    static String mobile_carrier="Airtel";

    //Default Constructor
Mobile(){
    System.out.println("DC");
}

//Parameterized Constructor
    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
void Mobile1(){


}
    void display(){


        System.out.println(this.name + this.phone+this.price);
    }


    static void switchon(){
        System.out.println("commonToAll");
    }

    void priceChange(Integer price){
        System.out.println("Change price in Integer");
    }
    void priceChange(Double price){
        System.out.println("Change price in dec");
    }



    @Override
    void calling() {
        System.out.println("dialpad is touch now");
    }
}



class old_phone implements Simcard{

    void calling(){
        System.out.println("dialpad");
    }
    @Override
   public  void entercard(){
        System.out.println("card Entered");
    }

}


interface Simcard{
    void entercard();
}