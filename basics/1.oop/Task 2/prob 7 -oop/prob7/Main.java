package prob7;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ClupFc clupFc=new ClupFc();
ClupRel clupRel=new ClupRel();
Player player=new ClupFc();

        Scanner scanner= new Scanner(System.in);


        System.out.println("Enter a Fcode");
clupFc.setFcode(scanner.nextInt());
        System.out.println("Enter a Rcode");
clupRel.setRcode(scanner.nextInt());
        System.out.println("Enter a id");
player.setId(scanner.nextInt());
        System.out.println("Enter a name");
        player.setName(scanner.next());
        System.out.println("Enter a number");
        player.setNumber(scanner.nextInt());



        System.out.println("Getid: "+player.getId());
        System.out.println("Getname: "+player.getName());
        System.out.println("Getnumber: "+player.getNumber());
        System.out.println("getfcode: "+clupFc.getFcode());
        System.out.println("GetRcode: "+clupRel.getRcode());







    }
}