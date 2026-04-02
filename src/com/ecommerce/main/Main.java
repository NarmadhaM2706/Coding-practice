package com.ecommerce.main;
import com.ecommerce.model.*;
import com.ecommerce.service.OrderService;
public class Main {
public static void main(String[] args) {
    User u = new User(" Test_user","dubai");
    Product p=new Product("Keyboard",300.00);
    Order o = new  Order(u,p,4);
    OrderService ser=new OrderService();
    ser.placeOrder(o);
}
}
