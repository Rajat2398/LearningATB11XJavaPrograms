package ex_27_ENUM;

public enum Locators {


    page_button("#btn"),
    page_input("input");




    private String locators;

    Locators(String locators) {
        this.locators= locators;
    }
    String getLocators(){

        return  this.getLocators();
    }

}
