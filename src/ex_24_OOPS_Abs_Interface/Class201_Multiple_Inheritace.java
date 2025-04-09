package ex_24_OOPS_Abs_Interface;

public class Class201_Multiple_Inheritace {

    child c1 = new child() ;{
        c1.money();



    }

    interface Mother {


        void money();
    }

    interface Father {
        void money();
    }


    class child implements Mother, Father {

        @Override
        public void money() {
            System.out.println("Child Money!");
        }
    }
}