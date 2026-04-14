package prob7;

public class ClupRel extends Player{


    private Integer Rcode;

    public void setRcode(int rcode) {
        Rcode = rcode;
    }

    public int getRcode() {
        return Rcode;
    }
    void printClupRel(){
        System.out.println("Rcode : "+Rcode);
    }
}

