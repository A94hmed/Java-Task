package prob5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Person person =new Person();
Player player=new Player();
Student student=new Student();
ShareData shareData=new ShareData();
BaseEntity baseEntity=new BaseEntity();


Scanner scanner=new Scanner(System.in);
//class BaseEntity
        System.out.println("Enter a personID");
baseEntity.setId(scanner.nextInt());
        System.out.println("Enter a personname");
baseEntity.setName(scanner.next());

//class Player
        System.out.println("Enter a playernumber");
        player.setNumber(scanner.nextInt());

        //class Student
        System.out.println("Enter a Studentage");
student.setAge(scanner.nextInt());
//class Sharedata
        System.out.println("Enter a Studentphone");
shareData.setPhone(scanner.nextInt());

student.printStudent();
player.printPlayer();
shareData.printShareData();
baseEntity.printBaseEntity();





    }
}