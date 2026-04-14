package Problem8;

public abstract class Posts {
    int id;
    String text;
    String image;

    //constructor

    Posts(){

    }
    Posts(int id, String text,String image){
        this.id=id;
        this.text=text;
        this.image=image;

    }
    public abstract void print();



}
