package Problem11;

public abstract class Resturant {
    String order;


    void addOrder(String order) {
        this.order = order;
        System.out.println("Order added: " + order);
    }


    abstract void showOrder();
}
