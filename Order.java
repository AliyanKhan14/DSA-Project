
import java.util.ArrayList;

public class Order {

    private int orderId;
    private int tableNumber;
    private ArrayList<FoodItem> items;
    private ArrayList<Integer> quantities;

    public Order(int orderId, int tableNumber) {
        this.orderId = orderId;
        this.tableNumber = tableNumber;
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(FoodItem food, int quantity) {
        items.add(food);
        quantities.add(quantity);
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }

        return total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Table Number: " + tableNumber);

        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getFoodName()
                    + " x " + quantities.get(i));
        }

        System.out.println("Total Bill: Rs. " + calculateTotal());
    }
}
