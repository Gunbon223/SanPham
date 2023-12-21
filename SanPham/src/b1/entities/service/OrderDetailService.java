package b1.entities.service;

import b1.entities.OrderDetail;
import b1.entities.Product;

import java.util.Map;
import java.util.Scanner;

public class OrderDetailService {
    ProductService productService = new ProductService();
    public OrderDetail insertOrderDetail(Scanner scan, Map<Integer,Product> productMap) {
        System.out.println("Nhập id sản phẩm: ");
        System.out.println(productMap);
        int idProduct = Integer.parseInt(scan.nextLine());
        Product product = productMap.get(idProduct);
        int quantityOfProduct = product.getQuantity();
        System.out.println("Nhập số lượng: ");
        int quantity = Integer.parseInt(scan.nextLine());
        while (quantity > quantityOfProduct) {
            System.out.println("Quá sl trong kho !");
            quantity = Integer.parseInt(scan.nextLine());
        }
        OrderDetail orderDetail = new OrderDetail(product,quantity);
        return orderDetail;
    }


}
