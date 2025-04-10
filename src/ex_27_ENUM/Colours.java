package ex_27_ENUM;

public enum Colours {


    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");


    private String hexcode;
    Colours(String hexcode){
        this.hexcode=hexcode;
    }
    String getHexcode(){
        return  this.hexcode;
    }


}
