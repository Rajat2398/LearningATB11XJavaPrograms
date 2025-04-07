package ex_20_Encapsulation;

public class Lab191_Encap {
    public static void main(String[] args) {


        VWOLOGIN vwologin = new VWOLOGIN("Rajat", "pass123");
        System.out.println(vwologin.password);
        vwologin.password="123";
        System.out.println(vwologin.password);







        GoodVWOLOGIN vwologin1= new GoodVWOLOGIN("Rajat","Test123");
//        System.out.println(vwologin1.password);//java: password has private access
      // System.out.println(vwologin1.username);

        vwologin1.setUsername("Rajat");
        System.out.println(vwologin1.getUsername());

        System.out.println(vwologin1.getPassword());

        vwologin1.setPassword("Pass123",true);   //Pass123
        System.out.println(vwologin1.getPassword());

        vwologin1.setPassword("Pass123",false);  //  Not allowed to change the password
        System.out.println(vwologin1.getPassword());




    }

}



class VWOLOGIN{

    public String username;
    public String password;


    VWOLOGIN(String usr, String pwd){

        this.username= usr;
        this.password= pwd;

    }

}


class GoodVWOLOGIN{

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isadmin) {
        if (isadmin) {
            this.password = password;
        }
        else{
            System.out.println("Not allowed to change the password");
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;//Instance Variables
    private String password;

    GoodVWOLOGIN(String usr, String pwd){


        this.username= usr;
        this.password= pwd;

    }


}