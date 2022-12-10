public class Customer extends Person{
    private int number;
    private boolean emailList;

    public void setEmailList(boolean emailList) {
        this.emailList = emailList;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean getEmailList() {
        return emailList;
    }


}
