package Problem8;

import java.sql.SQLOutput;

public class LinkedIn extends Posts {
    LinkedIn(){

    }

    LinkedIn(int id , String text,String image){
        super(id,text,image);
    }

    @Override
    public void print(){
        System.out.println("application LinkedIn");
    }

}
