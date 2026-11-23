import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CanteenManager manager = new CanteenManager();

        manager.addFood(new FoodItem(101, "Burger", 350));
        manager.addFood(new FoodItem(102, "Fries", 150));
        manager.addFood(new FoodItem(103, "Sandwich", 200));
        manager.addFood(new FoodItem(104, "Pizza", 500));
        manager.addFood(new FoodItem(105, "Cold Drink", 100));

        System.out.println("===== CANTEEN MENU =====");

        for (int i = 0; i < manager.menu.size(); i++) {
            System.out.println((i + 1) + ". "
                    + manager.menu.get(i).getFoodName()
                    + " - Rs. "
                    + manager.menu.get(i).getPrice());
        }

        Order order = new Order(1, 5);

        String again;

        do {
            System.out.print("\nSelect food number: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= manager.menu.size()) {
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                order.addItem(manager.menu.get(choice - 1), quantity);
            } else {
                System.out.println("Invalid choice!");
            }

            System.out.print("Add another item? (yes/no): ");
            again = sc.next();

        } while (again.equalsIgnoreCase("yes"));

        manager.addOrder(order);

        System.out.println("\n===== CUSTOMER SECTION =====");
        System.out.println("Your Order:");
        order.displayOrder();

        System.out.println("\n===== OWNER SECTION =====");
        System.out.println("New Order Received:");
        manager.processOrder();

        sc.close();
    }
}