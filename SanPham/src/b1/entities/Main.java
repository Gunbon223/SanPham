package b1.entities;

import b1.entities.Order;
import b1.entities.Product;
import b1.entities.service.OrderService;
import b1.entities.service.ProductService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        ProductService productService = new ProductService();
        productService.insertProductList(scan,productMap);
        OrderService orderService = new OrderService();
       Order order = orderService.insertOrder(scan,productMap);
        System.out.println(order);
    }
}