package ex_30_exception;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


public  Integer add(Bank bankname) {

    if (bankname.currency.equals("INR")) {
        return bankname.amount + this.amount;
    }else {
        try {
            throw new CustomException ("Currency Mismatch!");
        } catch (CustomException e) {
            System.out.println(e.getMessage());        }
    }
    return 0;
}
}
class CustomException extends Exception{
    CustomException(String Msg){
        super(Msg);
    }
}

class NotvalidateageException extends Exception{
    NotvalidateageException(String e){
        super(e);
    }


}






