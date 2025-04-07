package ex_21_AccessModifier.Police;

public class Cop {

    private int gun;
   String icard;

   public Cop(int bullet){
       this.gun=bullet;
   }

   protected void canIshoot (){

        System.out.println("Yes you can shoot! ");
    }
}
