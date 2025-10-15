public class ProductManager {

    public static void main(String[] args) {
        System.out.println("Product Manager initialized.");
    }

    
    public double calculateDiscount(double price, double percent) {
        return price - (price * percent / 100);
    }
}