package prob7;

public class ClupFc extends Player{

    private Integer Fcode;

    public void setFcode(int fcode) {
        Fcode = fcode;
    }

    public int getFcode() {
        return Fcode;
    }

    void printClupFc(){
        System.out.println("Fcode : "+Fcode);
    }


}
