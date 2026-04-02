package Com.Ecommerce;

public class EcommercePackage {
    public static void main(String args[])
    {
        User u=new("Text_user","Dubai");
        Product p=new Product("Keyboard",800);
        Order o=new Order(u,p,4);
        OrderService service=new OrderService();
        service.PlaceOrder(o);
        
    }
}
public class OrderService {
    public void PlaceOrer(Order order)
    {
        System.out.println(order.user.name);
        System.out.println(order.product);
        double totalPrice=order.product*order.quantity;
        System.out.println(totalPrice);

    }
}
public class User
{
    public String name;
    public String address;
    public User(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
}
public class Product {
    public String name;
    public double price;
    public Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
}

