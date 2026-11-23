
public class FoodItem {

    private int foodId;
    private String foodName;
    private double price;
    private boolean available;

    public FoodItem(int foodId, String foodName, double price) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.available = true;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayFood() {
        System.out.println(foodId + " | " + foodName
                + " | Rs. " + price
                + " | Available: " + available);
    }
}
