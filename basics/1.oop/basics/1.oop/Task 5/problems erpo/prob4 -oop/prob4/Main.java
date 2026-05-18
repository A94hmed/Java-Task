package prob4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //class Player
        Player player=new Player();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter PlayerID");
        player.setId(scanner.nextInt());
        System.out.println("Enter PlayerName");
        player.setName(scanner.next());
        System.out.println("Enter PlayerNumber");
        player.setNumber(scanner.nextInt());

        player.printPlayer();

        // class Student
        Student student =new Student();
        System.out.println("Enter StudentID");
        student.setId(scanner.nextInt());
        System.out.println("Enter StudentName");
        student.setName(scanner.next());
        System.out.println("Enter StudentNumber");
        student.setAge(scanner.nextInt());

        student.printStudent();





    }
}