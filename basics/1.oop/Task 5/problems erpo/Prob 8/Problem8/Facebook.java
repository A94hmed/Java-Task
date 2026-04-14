package Problem8;

public class Facebook extends Posts{
 Facebook(){

 }
 Facebook(int id,String text,String image){
     super(id,text,image);
 }
    @Override
    public void print(){
        System.out.println("application facebook");
    }
}
