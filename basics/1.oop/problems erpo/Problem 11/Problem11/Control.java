package Problem11;

import java.util.Scanner;

public class Control {
    public void print() {
        Scanner sc = new Scanner(System.in);

        RestaurantImpl r = new RestaurantImpl();

        System.out.print("Enter your order: ");
        String o = sc.next();
        r.addOrder(o);
        r.showOrder();
    }
}
