package prob5;

public class Player {

    private Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    void printPlayer(){
        System.out.println("number"+number);
    }
}
