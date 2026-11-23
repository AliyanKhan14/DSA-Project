import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

public class CanteenManager {

    ArrayList<FoodItem> menu = new ArrayList<>();
    Queue<Order> orders = new LinkedList<>();
    HashMap<Integer, Order> orderMap = new HashMap<>();

    public void addFood(FoodItem food) {
        menu.add(food);
    }

    public boolean searchFood(String name) {
        for (int i = 0; i < menu.size(); i++) {
            if (menu.get(i).getFoodName().equalsIgnoreCase(name)) {
                System.out.println("Food Found!");
                System.out.println("Name: " + menu.get(i).getFoodName());
                System.out.println("Price: Rs. " + menu.get(i).getPrice());
                return true;
            }
        }

        System.out.println("Food not found!");
        return false;
    }

    public void addOrder(Order order) {
        orders.add(order);
        orderMap.put(order.getOrderId(), order);
    }

    public void processOrder() {
        if (!orders.isEmpty()) {
            Order order = orders.poll();
            order.displayOrder();
        } else {
            System.out.println("No pending orders!");
        }
    }

    public void searchOrder(int id) {
        if (orderMap.containsKey(id)) {
            orderMap.get(id).displayOrder();
        } else {
            System.out.println("Order not found!");
        }
    }
}