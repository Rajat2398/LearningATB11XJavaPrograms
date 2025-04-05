package ex_19_Polymorphism.overridding;

public class Lab190_MOVerridding_Automation {

    public static void main(String[] args) {

        commonToAll c1= new commonToAll();
        c1.openBrowser();

        Chrome c2= new Chrome();
        c2.openBrowser();

        Firefox c3= new Firefox();
        c3.openBrowser();



        //Dynamic Dispatch
        commonToAll ch1= new Firefox();
        ch1.openBrowser();

        commonToAll ch2 = new Chrome();
        ch2.openBrowser();

        //Firefox f1= new Chrome();-> not possible because of no relatoinship

    }
}
class commonToAll{

    void openBrowser(){
        System.out.println("IE will open");

    }}
     class Chrome extends commonToAll{
         @Override
         void openBrowser() {
             System.out.println("Chrome will Open");
         }
     }

     class Firefox extends commonToAll{
         @Override
         void openBrowser() {
             System.out.println("Firefox will open");
         }

     }
