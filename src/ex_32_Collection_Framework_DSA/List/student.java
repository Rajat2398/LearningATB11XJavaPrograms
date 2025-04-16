package ex_32_Collection_Framework_DSA.List;

public class student {



    public student(String roll_No, String name) {
        this.RollNo = roll_No;
        this.name = name;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String RollNo;
    private String name;


    public void printdetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student RollNo.:" + this.RollNo);

    }

        @Override
              public   String toString(){
            return "student{" +
                    "name='" + name + '\''+
                    ",RollNo='" + RollNo + '\''+
                    "}";

    }
}
