package ex_20_Encapsulation;

public class Lab192 {

    public static void main(String[] args) {


        ICICI rajat= new ICICI("Rajat", 1233L);
        //rajat.bal();//No allowed


        long bal= rajat.getBal();
        System.out.println(bal);

        rajat.setBal(600,false);
        long bal_updated= rajat.getBal();
        System.out.println(bal_updated);
    }


}
class ICICI{


    //## Encapsulation
    //- It is a fundamental concept in OOPS
    //- Building of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only , you can access the data members/ attributes


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isadmin) {
        if(isadmin) {
            this.bal = bal;
        }else{
            System.out.println("Not allowed");
        }
    }

    private String name;
    private long bal;



    public ICICI(String name, long bal){



    }
}