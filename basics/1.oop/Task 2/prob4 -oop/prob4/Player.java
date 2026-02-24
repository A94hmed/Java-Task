package prob4;

public class Player {
private Integer id;
private String name;
 private Integer number;

    public void setId(int id) {

        if (id>0){
            this.id = id;
        }
        else{
            System.out.println("Invalid");
        }
    }

    public void setName(String name) {

        if(name.length()<=2){
            this.name = name;
        }
        else{
            System.out.println("Invalid");
        }
    }

    public void setNumber(int number) {

        if(number>=0 && number<=99){
            this.number = number;
        }
        else{
            System.out.println("Invalid");
        }
    }

    void printPlayer(){
        System.out.println("id :" +id);
        System.out.println("name :" +name);
        System.out.println("number :" +number);
    }

}
