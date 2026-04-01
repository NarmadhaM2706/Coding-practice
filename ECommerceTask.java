class ProductoutofStock extends Exception{
    public ProductoutofStock(String msg)
    {
        super(msg);
    }
}
class Paymentfailed extends Exception{
    public Paymentfailed(String msg)
    {
        super(msg);
    }
}
class OrderProcessingfailed extends Exception{
    public OrderProcessingfailed(String msg)
    {
        super(msg);
    }
}
class Product{
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price)
    {
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User
{
    String name;
    String address;
    User(String name,String address)
    {
        this.name=name;
        this.address= address;
    }
}
class Order{
    Product product;
    User user;
    int quantity;
    Order(Product product,User user,int quantity)
    {
        this.product=product;
        this.user=user;
        this.quantity=quantity;
    }
}
class OrderService
{
    public static void PlaceOrder(Order order) throws ProductoutofStock,Paymentfailed,OrderProcessingfailed{
        if (order.product.stock < order.quantity) {
            throw new ProductoutofStock("Not enough stock available");
        }

        // Simulate payment failure (40% chance)
        if (Math.random() < 0.4) {   // FIX: random()
            throw new Paymentfailed("Payment failed");
        }

        // Simulate processing failure (20% chance)
        if (Math.random() < 0.2) {
            throw new OrderProcessingfailed("Order processing failed");
        }

        // If everything is fine → reduce stock
        order.product.stock -= order.quantity;

        System.out.println("Order placed successfully!");
        System.out.println("Product: " + order.product.name);
        System.out.println("User: " + order.user.name);
        System.out.println("Remaining stock: " + order.product.stock);
    }
}
public class ECommerceTask {
        public static void main(String[] args)
    {
Product product = new Product("Laptop", 5, 50000);
        User user = new User("Narmadha", "Chennai");
        Order order = new Order(product, user, 2);

        try {
            OrderService.PlaceOrder(order);
        } 
        catch (ProductoutofStock e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (Paymentfailed e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (OrderProcessingfailed e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Order attempt finished.");
        }
    }
}
